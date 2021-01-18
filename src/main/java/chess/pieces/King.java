package chess.pieces;

import java.util.LinkedList;

import chess.board.Board;
import chess.board.Position;
import chess.players.Color;

public class King extends Piece {

	public King(Position position, Color color) {
		super(position, color);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		legalMoves = new LinkedList<Position>();
		// Columns
		int c[] = { 0, 1, 1, 1, 0, -1, -1, -1 };
		// Rows
		int r[] = { -1, -1, 0, 1, 1, 1, 0, -1 };
		for (int i = 0; i < c.length; i++) {
			Position position = getPosition().addRows(r[i]).addColums(c[i]);
			if (Board.isEmpty(position) || Board.isEnemy(position, getColor())) {
				checkAndAddLegalMove(position);
			}
		}
		return legalMoves;
	}

}
