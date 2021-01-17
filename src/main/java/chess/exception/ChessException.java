package chess.exception;

public class ChessException extends Exception {
	public final static String IllegalMove = "Illeagel Move";

	public ChessException(String message) {
		super(message);
	}
}
