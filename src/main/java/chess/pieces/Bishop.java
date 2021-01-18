package chess.pieces;

import java.util.LinkedList;

import chess.board.Board;
import chess.board.Position;
import chess.players.Color;

public class Bishop extends Piece {

	public Bishop(Position position, Color color) {
		super(position, color);
		setWeight(3);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		legalMoves = new LinkedList<Position>();
		Position position;
		// First Direction
		for (int i = 1; i < 8; i++) {
			position = getPosition().addRows(i).addColums(i);
			if (Board.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Board.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		for (int i = 7; i > 0; i--) {
			position = getPosition().addRows(i).addColums(i);
			if (Board.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Board.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		// Second Direction
		for (int i = 1; i < 8; i++) {
			position = getPosition().addColums(i).addRows(-i);
			if (Board.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Board.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		for (int i = 7; i > 0; i--) {
			position = getPosition().addColums(i).addRows(-i);
			if (Board.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Board.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		return legalMoves;
	}

}
