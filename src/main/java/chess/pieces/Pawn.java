package chess.pieces;

import java.util.LinkedList;

import chess.board.Board;
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
				addToLegalMoves(legalMoves, getPosition().getColumn(), getPosition().getRow() + 1);
				addToLegalMoves(legalMoves, getPosition().getColumn(), getPosition().getRow() + 2);
			}
		} else { // Black Piece

		}
		return null;
	}

	private void addToLegalMoves(LinkedList<Position> legalMoves, int column, int row) {
		if (Board.isEmpty(new Position(column, row))) {
			
		}
	}

}
