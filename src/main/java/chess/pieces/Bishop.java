package chess.pieces;

import java.util.LinkedList;

import chess.board.Position;
import chess.players.Color;

public class Bishop extends Piece {

	public Bishop(Position position, Color color) {
		super(position, color);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		return null;
	}

}
