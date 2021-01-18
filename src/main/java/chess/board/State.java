package chess.board;

import chess.exception.ChessException;
import chess.pieces.Piece;
import chess.players.Color;

public class State {
	private Piece[][] positions;
	private Color turn;

	public State(Piece positions[][], Color turn) {
		positions = new Piece[8][8];
		setPositions(positions);
		setTurn(turn);
	}

	public void movePiece(Piece piece, Position position) throws ChessException {
		if (turn != piece.getColor())
			throw new ChessException(ChessException.ILlegalTurn);
		if (piece.getPosition().equals(position)) {
			throw new ChessException(ChessException.IllegalMove);
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
}
