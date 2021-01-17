package chess;

import java.io.IOException;
import java.util.HashMap;

public class Board {
	private static HashMap<Position, Piece> positions;

	public Board() {
		positions = new HashMap<Position, Piece>();
	}

	public static void movePiece(Piece piece, Position position) throws ChessException {
		if (positions.get(position) == null || piece.getPosition() == position) {
			throw new ChessException(Error.IllegalMove.getErrorMessage());
		}
		positions.put(piece.getPosition(), null);
		positions.put(position, piece);
	}

	public static Piece checkPosition(Position position) {
		return positions.get(position);
	}
}
