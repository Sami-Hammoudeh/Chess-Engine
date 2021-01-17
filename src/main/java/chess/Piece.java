package chess;

public abstract class Piece {
	private static int weight;
	private static boolean white;
	private static boolean black;
	private Position position;

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
