package chess.pieces;

import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.control.Main;
import chess.object.ChessObject;
import chess.players.Color;

public class Rook extends Piece {

	public Rook(Position position, Color color) {
		super(position, color);
		setWeight(5);
	}

	@Override
	public ChessLinkedList<Position> getLegalMoves() {
		legalMoves = new ChessLinkedList<Position>();
		Position position;
		// Rows
		for (int i = 1; i < 8; i++) {
			position = getPosition().addRows(i);
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
			position = getPosition().addRows(i);
			if (Main.mainBoard.isEmpty(position)) {
				checkAndAddLegalMove(position);
			} else {
				if (Main.mainBoard.isEnemy(position, getColor())) {
					checkAndAddLegalMove(position);
				}
				break;
			}
		}
		// Columns
		for (int i = 1; i < 8; i++) {
			position = getPosition().addColums(i);
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
			position = getPosition().addColums(i);
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
	public ChessObject copy() {
		// TODO Auto-generated method stub
		return null;
	}

}
