package chess.pieces;

import java.util.LinkedList;

import chess.board.Board;
import chess.board.Position;
import chess.players.Color;

public class Rook extends Piece {

	public Rook(Position position, Color color) {
		super(position, color);
		setWeight(5);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		legalMoves = new LinkedList<Position>();
		Position position;
		// Rows
		for (int i = 1; i < 8; i++) {
			position = getPosition().addRows(i);
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
			position = getPosition().addRows(i);
			if (Board.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Board.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		// Columns
		for (int i = 1; i < 8; i++) {
			position = getPosition().addColums(i);
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
			position = getPosition().addColums(i);
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
