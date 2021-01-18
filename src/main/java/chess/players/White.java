package chess.players;

import chess.board.Position;
import chess.pieces.*;

public class White extends Player {
	
	@Override
	public void fillPieces() {
		// Pawns
		getPieces().add(new Pawn(Position.A2));
		getPieces().add(new Pawn(Position.B2));
		getPieces().add(new Pawn(Position.C2));
		getPieces().add(new Pawn(Position.D2));
		getPieces().add(new Pawn(Position.E2));
		getPieces().add(new Pawn(Position.F2));
		getPieces().add(new Pawn(Position.G2));
		getPieces().add(new Pawn(Position.H2));
		// Rooks
		getPieces().add(new Rook(Position.A1));
		getPieces().add(new Rook(Position.H1));
		// Knights
		getPieces().add(new Knight(Position.B1));
		getPieces().add(new Knight(Position.G1));
		// Bishops
		getPieces().add(new Bishop(Position.C1));
		getPieces().add(new Bishop(Position.F1));
		// Queen
		getPieces().add(new Queen(Position.D1));
		// King
		getPieces().add(new King(Position.E1));
	}
}
