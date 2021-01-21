package chess.players;

import chess.board.Position;
import chess.opject.ChessObject;
import chess.pieces.*;

public class White extends Player {

	@Override
	public void fillPieces() {
		// Pawns
		addPiece(new Pawn(new Position('A', 2), Color.WHITE));
		addPiece(new Pawn(new Position('B', 2), Color.WHITE));
		addPiece(new Pawn(new Position('C', 2), Color.WHITE));
		addPiece(new Pawn(new Position('D', 2), Color.WHITE));
		addPiece(new Pawn(new Position('E', 2), Color.WHITE));
		addPiece(new Pawn(new Position('F', 2), Color.WHITE));
		addPiece(new Pawn(new Position('G', 2), Color.WHITE));
		addPiece(new Pawn(new Position('H', 2), Color.WHITE));
		// Rooks
		addPiece(new Rook(new Position('A', 1), Color.WHITE));
		addPiece(new Rook(new Position('H', 1), Color.WHITE));
		// Knights
		addPiece(new Knight(new Position('B', 1), Color.WHITE));
		addPiece(new Knight(new Position('G', 1), Color.WHITE));
		// Bishops
		addPiece(new Bishop(new Position('C', 1), Color.WHITE));
		addPiece(new Bishop(new Position('F', 1), Color.WHITE));
		// Queen
		addPiece(new Queen(new Position('D', 1), Color.WHITE));
		// King
		addPiece(new King(new Position('E', 1), Color.WHITE));
	}

	@Override
	public boolean isInCheck() {
		return false;
	}

	@Override
	public ChessObject copy() {
		return null;
	}

	@Override
	public boolean equals(ChessObject co) {
		// TODO Auto-generated method stub
		return false;
	}
}
