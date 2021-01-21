package chess.players;

import java.util.HashSet;

import chess.control.Main;
import chess.error.Error;
import chess.object.ChessObject;
import chess.pieces.Piece;

public abstract class Player extends ChessObject {
	private HashSet<Piece> pieces;
	private boolean inCheck;

	public Player() {
		pieces = new HashSet<Piece>();
		fillPieces();
		setInCheck(false);
	}

	public Player(HashSet<Piece> pieces) {
		setPieces(pieces);
		setInCheck(inCheck);
	}

	public void killPiece(Piece piece) throws Exception {
		if (!pieces.remove(piece)) {
			throw new Exception(Error.PieceNotFound);
		}
	}

	public void addPiece(Piece piece) {
		pieces.add(piece);
		Main.mainBoard.setPosition(piece.getPosition(), piece);
	}

	public HashSet<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(HashSet<Piece> pieces) {
		this.pieces = pieces;
	}

	public void setInCheck(boolean inCheck) {
		this.inCheck = inCheck;
	}

	public abstract boolean isInCheck();

	public abstract void fillPieces();
}
