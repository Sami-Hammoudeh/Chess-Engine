package chess.players;

import chess.board.Position;
import chess.collections.ChessHashSet;
import chess.control.Main;
import chess.error.Error;
import chess.object.ChessObject;
import chess.pieces.Piece;

public abstract class Player extends ChessObject {
	private ChessHashSet<Piece> pieces;
	private boolean inCheck;
	private Player enemy;
	private Color color;

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
		Main.BOARD.setPosition(piece.getPosition(), piece);
	}

	public Piece getKing() {
		return null;
	}

	public ChessHashSet<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(ChessHashSet<Piece> pieces) {
		this.pieces = pieces;
	}

	public Player getEnemy() {
		return enemy;
	}

	public void setEnemy(Player enemy) {
		this.enemy = enemy;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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

	public boolean isInCheck() {
		Position kingPosition = getKing().getPosition();
		for (Piece piece : getEnemy().getPieces())
			for (Position position : piece.getLegalMoves())
				if (position.equals(kingPosition))
					return true;
		return false;
	}

	public abstract void fillPieces();
}
