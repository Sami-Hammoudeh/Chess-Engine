package chess.players;

import chess.board.Position;
import chess.pieces.*;

public class White extends Player {

	@Override
	public void fillPieces() {
		// Pawns
		getPieces().add(new Pawn(Position.A2, Color.WHITE));
		getPieces().add(new Pawn(Position.B2, Color.WHITE));
		getPieces().add(new Pawn(Position.C2, Color.WHITE));
		getPieces().add(new Pawn(Position.D2, Color.WHITE));
		getPieces().add(new Pawn(Position.E2, Color.WHITE));
		getPieces().add(new Pawn(Position.F2, Color.WHITE));
		getPieces().add(new Pawn(Position.G2, Color.WHITE));
		getPieces().add(new Pawn(Position.H2, Color.WHITE));
		// Rooks
		getPieces().add(new Rook(Position.A1, Color.WHITE));
		getPieces().add(new Rook(Position.H1, Color.WHITE));
		// Knights
		getPieces().add(new Knight(Position.B1, Color.WHITE));
		getPieces().add(new Knight(Position.G1, Color.WHITE));
		// Bishops
		getPieces().add(new Bishop(Position.C1, Color.WHITE));
		getPieces().add(new Bishop(Position.F1, Color.WHITE));
		// Queen
		getPieces().add(new Queen(Position.D1, Color.WHITE));
		// King
		getPieces().add(new King(Position.E1, Color.WHITE));
	}
}
