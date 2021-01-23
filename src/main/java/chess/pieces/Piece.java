package chess.pieces;

import chess.board.Board;
import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.control.Main;
import chess.object.ChessObject;
import chess.players.Color;
import chess.players.Player;

public abstract class Piece extends ChessObject {
	private int weight;
	private boolean white;
	private boolean black;
	private Position position;
	private Color color;
	private Player player;
	ChessLinkedList<Position> legalMoves;

	public Piece(Position position, Color color) {
		setPosition(position);
		setColor(color);
		legalMoves = new ChessLinkedList<Position>();
	}

	public boolean move(Board board, Position position) {
		if (board.isEmpty(position) || board.isEnemy(position, color)) {
			try {
				board.movePiece(this, position);
			} catch (Exception e) {
				return false;
			}
			setPosition(position);
			return true;
		}
		return false;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		if (color == Color.WHITE)
			setPlayer(Main.WHITE);
		else
			setPlayer(Main.BLACK);
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
		this.black = !white;
	}

	public boolean isBlack() {
		return black;
	}

	public void setBlack(boolean black) {
		this.black = black;
		this.white = !black;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setLegalMoves(ChessLinkedList<Position> legalMoves) {
		this.legalMoves = legalMoves;
	}

	public void checkAndAddLegalMove(Position position) {
		Board state = (Board) Main.BOARD.copy();
		setColor(getColor());
		Player player = (Player) getPlayer().copy();
		Piece piece = player.getPiece(getPosition());
		try {
			piece.move(state, position);
			if (player.isInCheck())
				return;
		} catch (Exception e) {
			return;
		}
		legalMoves.add(position);
	}

	@Override
	public boolean equals(ChessObject co) {
		if (co == this)
			return true;
		if (co == null || co.getClass() != getClass())
			return false;
		Piece piece = (Piece) co;
		return piece.getPosition().equals(getPosition()) && piece.getColor() == getColor();
	}

	public abstract ChessLinkedList<Position> getLegalMoves();

}
