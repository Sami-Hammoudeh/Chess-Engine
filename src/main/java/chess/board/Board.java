package chess.board;

import chess.exception.ChessException;
import chess.pieces.Piece;

public abstract class Board {

	private static Piece[][] positions;

	public Board() {
		positions = new Piece[8][8];
	}

	public static void movePiece(Piece piece, Position position) throws ChessException {
		if (piece.getPosition().equals(position)) {
			throw new ChessException(ChessException.IllegalMove);
		}
		setPosition(piece.getPosition(), null);
		setPosition(position, piece);
	}

	public static Piece getPosition(Position position) {
		return positions[position.getColumn() - 1][position.getRow() - 1];
	}

	public static boolean isEmpty(Position position) {
		if (!(position.isValid()))
			return false;
		return getPosition(position) == null;
	}

	public static void setPosition(Position position, Piece piece) {
		positions[position.getColumn() - 1][position.getRow() - 1] = piece;
	}
}
