package chess.players;

import java.util.HashSet;

import chess.exception.ChessException;
import chess.pieces.Piece;

public abstract class Player {
	private static HashSet<Piece> pieces;

	public Player() {
		pieces = new HashSet<Piece>();
		fillPieces();
	}

	public static void killPiece(Piece piece) throws ChessException {
		if (!pieces.remove(piece)) {
			throw new ChessException(ChessException.PieceNotFound);
		}
	}

	public static HashSet<Piece> getPieces() {
		return pieces;
	}

	public static void setPieces(HashSet<Piece> pieces) {
		Player.pieces = pieces;
	}

	public abstract void fillPieces();
}
