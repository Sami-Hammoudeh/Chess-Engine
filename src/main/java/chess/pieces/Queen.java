package chess.pieces;

import java.util.LinkedList;

import chess.board.Position;
import chess.players.Color;

public class Queen extends Piece {

	public Queen(Position position, Color color) {
		super(position, color);
		setWeight(8);
	}

	@Override
	public LinkedList<Position> getLegalMoves() {
		legalMoves = new LinkedList<Position>();
		Piece tempRook = new Rook(getPosition(), getColor());
		Piece tempBishop = new Bishop(getPosition(), getColor());
		legalMoves.addAll(tempRook.getLegalMoves());
		legalMoves.addAll(tempBishop.getLegalMoves());
		return legalMoves;
	}

}
