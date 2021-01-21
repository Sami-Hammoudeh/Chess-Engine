package chess.pieces;

import java.util.LinkedList;

import chess.board.Position;
import chess.control.Main;
import chess.opject.ChessObject;
import chess.players.Color;

public abstract class Piece extends ChessObject {
	private int weight;
	private boolean white;
	private boolean black;
	private Position position;
	private Color color;
	LinkedList<Position> legalMoves;

	public Piece(Position position, Color color) {
		setPosition(position);
		setColor(color);
		legalMoves = new LinkedList<Position>();
	}

	public boolean moveTo(Position position) {
		if (Main.mainBoard.getPosition(position) == null) {
			try {
				Main.mainBoard.movePiece(this, position);
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

	public void checkAndAddLegalMove(Position position) {
		// Check if the king is inCheck

		legalMoves.add(position);
	}

	public abstract LinkedList<Position> getLegalMoves();

}
