package chess.players;

import chess.collections.ChessHashSet;
import chess.control.Main;
import chess.error.Error;
import chess.object.ChessObject;
import chess.pieces.Piece;

public abstract class Player extends ChessObject {
	private ChessHashSet<Piece> pieces;
	private boolean inCheck;

	public Player() {
		pieces = new ChessHashSet<Piece>();
		fillPieces();
		setInCheck(false);
	}

	public Player(ChessHashSet<Piece> pieces) {
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

	public ChessHashSet<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(ChessHashSet<Piece> pieces) {
		this.pieces = pieces;
	}

	public void setInCheck(boolean inCheck) {
		this.inCheck = inCheck;
	}

	@Override
	public boolean equals(ChessObject co) {
		if (co == this)
			return true;
		if (co == null || co.getClass() != this.getClass())
			return false;
		Player player = (Player) co;
		return player.getPieces().equals(getPieces());
	}

	public abstract boolean isInCheck();

	public abstract void fillPieces();
}
