package chess.players;

import java.util.HashSet;

import chess.exception.ChessException;
import chess.pieces.Piece;

public abstract class Player {
	private HashSet<Piece> pieces;

	public Player() {
		pieces = new HashSet<Piece>();
		fillPieces();
	}

	public void killPiece(Piece piece) throws ChessException {
		if (!pieces.remove(piece)) {
			throw new ChessException(ChessException.PieceNotFound);
		}
	}

	public HashSet<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(HashSet<Piece> pieces) {
		this.pieces = pieces;
	}

	public abstract void fillPieces();
}
