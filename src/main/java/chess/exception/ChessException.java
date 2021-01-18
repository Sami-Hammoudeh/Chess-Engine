package chess.exception;

public class ChessException extends Exception {
	private static final long serialVersionUID = 1L;
	public final static String IllegalMove = "Illeagel Move";
	public final static String PieceNotFound = "Piece Not Found";
	public final static String IllegalPosition = "Illegal Position";
	public final static String ILlegalTurn = "ILlegal Turn";

	public ChessException(String message) {
		super(message);
	}
}
