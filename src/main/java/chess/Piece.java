package chess;

public abstract class Piece {
	private static int weight;
	private static boolean white;
	private static boolean black;
	private Position position;

	public boolean moveTo(Position position) throws ChessException {
		if (Board.checkPosition(position) == null) {
			Board.movePiece(this, position);
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
