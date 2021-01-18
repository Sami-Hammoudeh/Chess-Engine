package chess.pieces;

import java.util.LinkedList;

import chess.board.Position;
import chess.players.Color;

public class Pawn extends Piece {

	public Pawn(Position position, Color color) {
		super(position, color);
		setWeight(1);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		LinkedList<Position> legalMoves = new LinkedList<Position>();
		// White Piece
		if (getColor() == Color.WHITE) {
			if (getPosition().getRow() == 2) {
				
			}
		} else { // Black Piece

		}
		return null;
	}

}
