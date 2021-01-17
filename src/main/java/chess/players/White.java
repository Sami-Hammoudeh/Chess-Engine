package chess.players;

import java.util.HashMap;

import chess.board.*;
import chess.pieces.*;

public class White {
	private HashMap<Piece, Boolean> pieces;

	public White() {
		pieces = new HashMap<Piece, Boolean>();
		fillPieces();
	}

	private void fillPieces() {
		// Pawns
		pieces.put(new Pawn(Position.A2), true);
		pieces.put(new Pawn(Position.B2), true);
		pieces.put(new Pawn(Position.C2), true);
		pieces.put(new Pawn(Position.D2), true);
		pieces.put(new Pawn(Position.E2), true);
		pieces.put(new Pawn(Position.F2), true);
		pieces.put(new Pawn(Position.G2), true);
		pieces.put(new Pawn(Position.H2), true);
		// Rooks
		pieces.put(new Rook(Position.A1), true);
		pieces.put(new Rook(Position.H1), true);
		// Knights
		pieces.put(new Knight(Position.B1), true);
		pieces.put(new Knight(Position.G1), true);
		// Bishops
		pieces.put(new Bishop(Position.C1), true);
		pieces.put(new Bishop(Position.F1), true);
		// Queen
		pieces.put(new Queen(Position.D1), true);
		// King
		pieces.put(new King(Position.E1), true);
	}
}
