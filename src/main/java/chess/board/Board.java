package chess.board;

import chess.error.Error;
import chess.object.ChessObject;
import chess.pieces.Piece;
import chess.players.Color;

public class Board extends ChessObject {

	private Piece[][] positions;
	public Color turn;

	public Board() {
		positions = new Piece[8][8];
		turn = Color.WHITE;
	}

	public Board(Piece[][] positions, Color turn) {
		this();
		this.positions = positions;
		this.turn = turn;
	}

	public void movePiece(Piece piece, Position position) throws Exception {
		if (turn != piece.getColor())
			throw new Exception(Error.ILlegalTurn);
		if (piece.getPosition().equals(position)) {
			throw new Exception(Error.IllegalMove);
		}
		setPosition(piece.getPosition(), null);
		setPosition(position, piece);
		flipTurn();
	}

	private void flipTurn() {
		if (turn == Color.WHITE)
			turn = Color.BLACK;
		else
			turn = Color.WHITE;
	}

	public Piece getPosition(Position position) {
		return positions[position.getColumn() - 1][position.getRow() - 1];
	}

	public boolean isEmpty(Position position) {
		try {
			return getPosition(position) == null;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isNotEmpty(Position position) {
		try {
			return isEnemy(position, turn) || isAlly(position, turn);
		} catch (Exception e) {
			return true;
		}
	}

	public boolean isEnemy(Position position, Color color) {
		try {
			return getPosition(position).getColor() != color;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isAlly(Position position, Color color) {
		try {
			return getPosition(position).getColor() == color;
		} catch (Exception e) {
			return false;
		}
	}

	public void setPosition(Position position, Piece piece) {
		positions[position.getColumn() - 1][position.getRow() - 1] = piece;
	}

	public Piece[][] getPositions() {
		return positions;
	}

	public void setPositions(Piece[][] positions) {
		this.positions = positions;
	}

	public Color getTurn() {
		return turn;
	}

	public void setTurn(Color turn) {
		this.turn = turn;
	}

	@Override
	public boolean equals(ChessObject co) {
		if (co == this)
			return true;
		if (co == null || co.getClass() != getClass())
			return false;
		Board board = (Board) co;
		if (board.getTurn() != getTurn())
			return false;
		int i = 0;
		for (Piece[] arr : positions) {
			int j = 0;
			for (Piece piece : arr) {
				if (!(piece.equals(getPositions()[i][j])))
					return false;
				j++;
			}
			i++;
		}
		return true;
	}

	@Override
	public ChessObject copy() {
		Board board = new Board();
		int i = 0;
		for (Piece[] arr : positions) {
			int j = 0;
			for (Piece piece : arr) {
				if (!(piece.equals(getPositions()[i][j]))) {
					board.getPositions()[i][j] = (Piece) piece.copy();
				}
				j++;
			}
			i++;
		}
		board.setTurn(getTurn());
		return board;
	}
}
