package chess.exception;

public class ChessException extends Exception {
	private static final long serialVersionUID = 1L;
	public final static String IllegalMove = "Illeagel Move";

	public ChessException(String message) {
		super(message);
	}
}
