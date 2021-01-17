package chess.players;

import java.util.HashMap;

import chess.board.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Piece;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class Black {
	private HashMap<Piece, Boolean> pieces;

	public Black() {
		pieces = new HashMap<Piece, Boolean>();
		fillPieces();
	}

	private void fillPieces() {
		// Pawns
		pieces.put(new Pawn(Position.A7), true);
		pieces.put(new Pawn(Position.B7), true);
		pieces.put(new Pawn(Position.C7), true);
		pieces.put(new Pawn(Position.D7), true);
		pieces.put(new Pawn(Position.E7), true);
		pieces.put(new Pawn(Position.F7), true);
		pieces.put(new Pawn(Position.G7), true);
		pieces.put(new Pawn(Position.H7), true);
		// Rooks
		pieces.put(new Rook(Position.A8), true);
		pieces.put(new Rook(Position.H8), true);
		// Knights
		pieces.put(new Knight(Position.B8), true);
		pieces.put(new Knight(Position.G8), true);
		// Bishops
		pieces.put(new Bishop(Position.C8), true);
		pieces.put(new Bishop(Position.F8), true);
		// Queen
		pieces.put(new Queen(Position.D8), true);
		// King
		pieces.put(new King(Position.E8), true);
	}
}
