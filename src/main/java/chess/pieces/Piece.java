package chess.pieces;

import java.util.LinkedList;

import chess.board.Board;
import chess.board.Position;
import chess.exception.ChessException;
import chess.players.Color;

public abstract class Piece {
	private static int weight;
	private static boolean white;
	private static boolean black;
	private Position position;
	private Color color;

	public Piece(Position position, Color color) {
		setPosition(position);
		setColor(color);
	}

	public abstract LinkedList<Position> getLegalMoves();

	public boolean moveTo(Position position) {
		if (Board.checkPosition(position) == null) {
			try {
				Board.movePiece(this, position);
			} catch (ChessException e) {
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

	public static int getWeight() {
		return weight;
	}

	public static boolean isWhite() {
		return white;
	}

	public static void setWhite(boolean white) {
		Piece.white = white;
		Piece.black = !white;
	}

	public static boolean isBlack() {
		return black;
	}

	public static void setBlack(boolean black) {
		Piece.black = black;
		Piece.white = !black;
	}

}
