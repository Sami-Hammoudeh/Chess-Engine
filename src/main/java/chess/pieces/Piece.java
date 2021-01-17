package chess.pieces;

import chess.board.Board;
import chess.board.Position;
import chess.exception.ChessException;

public class Piece {
	private static int weight;
	private static boolean white;
	private static boolean black;
	private Position position;

	public Piece(Position position) {
		setPosition(position);
	}

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
