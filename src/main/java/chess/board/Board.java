package chess.board;

import java.util.HashMap;

import chess.exception.ChessException;
import chess.pieces.Piece;

public class Board {
	private static HashMap<Position, Piece> positions;

	public Board() {
		positions = new HashMap<Position, Piece>();
	}

	public static void movePiece(Piece piece, Position position) throws ChessException {
		if (piece.getPosition() == position) {
			throw new ChessException(ChessException.IllegalMove);
		}
		positions.put(piece.getPosition(), null);
		positions.put(position, piece);
	}

	public static Piece checkPosition(Position position) {
		return positions.get(position);
	}
}
