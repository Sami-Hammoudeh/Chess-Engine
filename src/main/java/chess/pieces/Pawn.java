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

	public LinkedList<Position> getLegalMoves() {
		legalMoves = new LinkedList<Position>();
		// White Piece
		if (getColor() == Color.WHITE) {
			if (getPosition().getRow() == 2) {
				addMove(getPosition().addRows(2));
			}
			addMove(getPosition().addRows(1));
			addKill(getPosition().addRows(1).addColums(1));
			addKill(getPosition().addRows(1).addColums(-1));
		} else { // Black Piece
			if (getPosition().getRow() == 7) {
				addMove(getPosition().addRows(-2));
			}
			addMove(getPosition().addRows(-1));
			addKill(getPosition().addRows(-1).addColums(1));
			addKill(getPosition().addRows(-1).addColums(-1));
		}
		return legalMoves;
	}

	private void addMove(Position position) {
		if (Board.isEmpty(position)) {
			addLegalMove(position);
		}
	}

	private void addKill(Position position) {
		if (Board.isKill(position, getColor())) {
			addLegalMove(position);
		}
	}

}
