package chess.players;

import java.util.HashSet;

import chess.board.Board;
import chess.control.Main;
import chess.exception.ChessException;
import chess.pieces.Piece;

public abstract class Player {
	private static HashSet<Piece> pieces;
	private static boolean inCheck;

	public Player() {
		pieces = new HashSet<Piece>();
		fillPieces();
		setInCheck(false);
	}

	public static void killPiece(Piece piece) throws ChessException {
		if (!pieces.remove(piece)) {
			throw new ChessException(ChessException.PieceNotFound);
		}
	}

	public static void addPiece(Piece piece) {
		pieces.add(piece);
		Main.mainBoard.setPosition(piece.getPosition(), piece);
	}

	public static HashSet<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(HashSet<Piece> pieces) {
		this.pieces = pieces;
	}

	public static void setInCheck(boolean inCheck) {
		Player.inCheck = inCheck;
	}

	public abstract boolean isInCheck();

	public abstract void fillPieces();
}
