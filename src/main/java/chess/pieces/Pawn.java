package chess.pieces;

import java.util.LinkedList;

import chess.board.Position;
import chess.control.Main;
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
		if (Main.mainBoard.isEmpty(position)) {
			checkAndAddLegalMove(position);
		}
	}

	private void addKill(Position position) {
		if (Main.mainBoard.isEnemy(position, getColor())) {
			checkAndAddLegalMove(position);
		}
	}

}
