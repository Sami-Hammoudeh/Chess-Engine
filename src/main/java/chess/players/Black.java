package chess.players;

import chess.board.Position;
import chess.pieces.*;

public class Black extends Player {

	@Override
	public void fillPieces() {
		// Pawns
		getPieces().add(new Pawn(Position.A7, Color.BLACK));
		getPieces().add(new Pawn(Position.B7, Color.BLACK));
		getPieces().add(new Pawn(Position.C7, Color.BLACK));
		getPieces().add(new Pawn(Position.D7, Color.BLACK));
		getPieces().add(new Pawn(Position.E7, Color.BLACK));
		getPieces().add(new Pawn(Position.F7, Color.BLACK));
		getPieces().add(new Pawn(Position.G7, Color.BLACK));
		getPieces().add(new Pawn(Position.H7, Color.BLACK));
		// Rooks
		getPieces().add(new Rook(Position.A8, Color.BLACK));
		getPieces().add(new Rook(Position.H8, Color.BLACK));
		// Knights
		getPieces().add(new Knight(Position.B8, Color.BLACK));
		getPieces().add(new Knight(Position.G8, Color.BLACK));
		// Bishops
		getPieces().add(new Bishop(Position.C8, Color.BLACK));
		getPieces().add(new Bishop(Position.F8, Color.BLACK));
		// Queen
		getPieces().add(new Queen(Position.D8, Color.BLACK));
		// King
		getPieces().add(new King(Position.E8, Color.BLACK));
	}
}
