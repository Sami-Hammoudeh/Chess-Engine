package chess.pieces;

import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.control.Main;
import chess.object.ChessObject;
import chess.players.Color;

public class Pawn extends Piece {

	public Pawn(Position position, Color color) {
		super(position, color);
		setWeight(1);
	}

	public ChessLinkedList<Position> getLegalMoves() {
		legalMoves = new ChessLinkedList<Position>();
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

	@Override
	public ChessObject copy() {
		return new Pawn((Position) getPosition().copy(), getColor());
	}

}
