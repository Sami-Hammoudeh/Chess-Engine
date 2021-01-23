package chess.pieces;

import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.control.Main;
import chess.object.ChessObject;
import chess.players.Color;

public class Knight extends Piece {

	public Knight(Position position, Color color) {
		super(position, color);
		setWeight(3);
	}

	@Override
	public ChessLinkedList<Position> getLegalMoves() {
		legalMoves = new ChessLinkedList<Position>();
		// Columns
		int[] c = { 1, 2, 2, 1, -1, -2, -2, -1 };
		// Rows
		int[] r = { -2, -1, 1, 2, 2, 1, -1, -2 };
		for (int i = 0; i < c.length; i++) {
			if (Main.BOARD.isEmpty(getPosition()) || Main.BOARD.isEnemy(getPosition(), getColor())) {
				checkAndAddLegalMove(getPosition().addRows(r[i]).addColums(c[i]));
			}
		}
		return legalMoves;
	}

	@Override
	public ChessObject copy() {
		return new Knight((Position) getPosition().copy(), getColor());
	}
}
