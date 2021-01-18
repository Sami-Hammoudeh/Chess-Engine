package chess.pieces;

import java.util.LinkedList;

import chess.board.Board;
import chess.board.Position;
import chess.control.Main;
import chess.players.Color;

public class Knight extends Piece {

	public Knight(Position position, Color color) {
		super(position, color);
		setWeight(3);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		legalMoves = new LinkedList<Position>();
		// Columns
		int[] c = { 1, 2, 2, 1, -1, -2, -2, -1 };
		// Rows
		int[] r = { -2, -1, 1, 2, 2, 1, -1, -2 };
		for (int i = 0; i < c.length; i++) {
			if (Main.mainBoard.isEmpty(getPosition()) || Main.mainBoard.isEnemy(getPosition(), getColor())) {
				checkAndAddLegalMove(getPosition().addRows(r[i]).addColums(c[i]));
			}
		}
		return legalMoves;
	}

}
