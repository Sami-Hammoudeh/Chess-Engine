package chess.pieces;

import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.control.Main;
import chess.object.ChessObject;
import chess.players.Color;

public class King extends Piece {

	public King(Position position, Color color) {
		super(position, color);
	}

	@Override
	public ChessLinkedList<Position> getLegalMoves() {
		legalMoves = new ChessLinkedList<Position>();
		// Columns
		int c[] = { 0, 1, 1, 1, 0, -1, -1, -1 };
		// Rows
		int r[] = { -1, -1, 0, 1, 1, 1, 0, -1 };
		for (int i = 0; i < c.length; i++) {
			Position position = getPosition().addRows(r[i]).addColums(c[i]);
			if (Main.mainBoard.isEmpty(position) || Main.mainBoard.isEnemy(position, getColor())) {
				checkAndAddLegalMove(position);
			}
		}
		return legalMoves;
	}

	@Override
	public ChessObject copy() {
		return new King((Position) getPosition().copy(), getColor());
	}

}
