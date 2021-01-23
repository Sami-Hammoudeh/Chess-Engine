package chess.pieces;

import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.control.Main;
import chess.object.ChessObject;
import chess.players.Color;

public class Bishop extends Piece {

	public Bishop(Position position, Color color) {
		super(position, color);
		setWeight(3);
	}

	@Override
	public ChessLinkedList<Position> getLegalMoves() {
		legalMoves = new ChessLinkedList<Position>();
		Position position;
		// First Direction
		for (int i = 1; i < 8; i++) {
			position = getPosition().addRows(i).addColums(i);
			if (Main.mainBoard.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Main.mainBoard.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		for (int i = 7; i > 0; i--) {
			position = getPosition().addRows(i).addColums(i);
			if (Main.mainBoard.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Main.mainBoard.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		// Second Direction
		for (int i = 1; i < 8; i++) {
			position = getPosition().addColums(i).addRows(-i);
			if (Main.mainBoard.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Main.mainBoard.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		for (int i = 7; i > 0; i--) {
			position = getPosition().addColums(i).addRows(-i);
			if (Main.mainBoard.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Main.mainBoard.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		return legalMoves;
	}

	@Override
	public boolean equals(ChessObject co) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChessObject copy() {
		// TODO Auto-generated method stub
		return null;
	}

}
