package chess.pieces;

import java.util.LinkedList;

import chess.board.Position;
import chess.players.Color;

public class Rook extends Piece {

	public Rook(Position position, Color color) {
		super(position, color);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		return null;
	}

}
