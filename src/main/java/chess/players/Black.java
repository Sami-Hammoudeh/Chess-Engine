package chess.players;

import java.util.HashSet;

import chess.board.Position;
import chess.exception.ChessException;
import chess.pieces.*;

public class Black extends Player {
	
	@Override
	public void fillPieces() {
		// Pawns
		getPieces().add(new Pawn(Position.A7));
		getPieces().add(new Pawn(Position.B7));
		getPieces().add(new Pawn(Position.C7));
		getPieces().add(new Pawn(Position.D7));
		getPieces().add(new Pawn(Position.E7));
		getPieces().add(new Pawn(Position.F7));
		getPieces().add(new Pawn(Position.G7));
		getPieces().add(new Pawn(Position.H7));
		// Rooks
		getPieces().add(new Rook(Position.A8));
		getPieces().add(new Rook(Position.H8));
		// Knights
		getPieces().add(new Knight(Position.B8));
		getPieces().add(new Knight(Position.G8));
		// Bishops
		getPieces().add(new Bishop(Position.C8));
		getPieces().add(new Bishop(Position.F8));
		// Queen
		getPieces().add(new Queen(Position.D8));
		// King
		getPieces().add(new King(Position.E8));
	}
}
