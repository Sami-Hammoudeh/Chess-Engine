package chess.pieces;

import chess.board.Position;
import chess.collections.ChessLinkedList;
import chess.object.ChessObject;
import chess.players.Color;

public class Queen extends Piece {

	public Queen(Position position, Color color) {
		super(position, color);
		setWeight(8);
	}

	@Override
	public ChessLinkedList<Position> getLegalMoves() {
		legalMoves = new ChessLinkedList<Position>();
		Piece tempRook = new Rook(getPosition(), getColor());
		Piece tempBishop = new Bishop(getPosition(), getColor());
		legalMoves.addAll(tempRook.getLegalMoves());
		legalMoves.addAll(tempBishop.getLegalMoves());
		return legalMoves;
	}

	@Override
	public ChessObject copy() {
		return new Queen((Position) getPosition().copy(), getColor());
	}

}
