package chess.players;

import chess.board.Position;
import chess.pieces.*;

public class Black extends Player {

	@Override
	public void fillPieces() {
		// Pawns
		addPiece(new Pawn(new Position('A', 7), Color.BLACK));
		addPiece(new Pawn(new Position('B', 7), Color.BLACK));
		addPiece(new Pawn(new Position('C', 7), Color.BLACK));
		addPiece(new Pawn(new Position('D', 7), Color.BLACK));
		addPiece(new Pawn(new Position('E', 7), Color.BLACK));
		addPiece(new Pawn(new Position('F', 7), Color.BLACK));
		addPiece(new Pawn(new Position('G', 7), Color.BLACK));
		addPiece(new Pawn(new Position('H', 7), Color.BLACK));
		// Rooks
		addPiece(new Rook(new Position('A', 8), Color.BLACK));
		addPiece(new Rook(new Position('H', 8), Color.BLACK));
		// Knights
		addPiece(new Knight(new Position('B', 8), Color.BLACK));
		addPiece(new Knight(new Position('G', 8), Color.BLACK));
		// Bishops
		addPiece(new Bishop(new Position('C', 8), Color.BLACK));
		addPiece(new Bishop(new Position('F', 8), Color.BLACK));
		// Queen
		addPiece(new Queen(new Position('D', 8), Color.BLACK));
		// King
		addPiece(new King(new Position('E', 8), Color.BLACK));
	}

	@Override
	public boolean isInCheck() {
		return false;
	}

	@Override
	public Player copy() {
		return null;
	}

	@Override
	public boolean equals(Player player) {
		// TODO Auto-generated method stub
		return false;
	}
}
