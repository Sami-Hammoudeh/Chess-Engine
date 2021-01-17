package chess.players;

import java.util.HashSet;

import chess.board.Position;
import chess.exception.ChessException;
import chess.pieces.*;

public class White {
	private HashSet<Piece> pieces;

	public White() {
		pieces = new HashSet<Piece>();
		fillPieces();
	}

	public void killPiece(Piece piece) throws ChessException {
		if (!pieces.remove(piece)) {
			throw new ChessException(ChessException.PieceNotFound);
		}
	}

	private void fillPieces() {
		// Pawns
		pieces.add(new Pawn(Position.A2));
		pieces.add(new Pawn(Position.B2));
		pieces.add(new Pawn(Position.C2));
		pieces.add(new Pawn(Position.D2));
		pieces.add(new Pawn(Position.E2));
		pieces.add(new Pawn(Position.F2));
		pieces.add(new Pawn(Position.G2));
		pieces.add(new Pawn(Position.H2));
		// Rooks
		pieces.add(new Rook(Position.A1));
		pieces.add(new Rook(Position.H1));
		// Knights
		pieces.add(new Knight(Position.B1));
		pieces.add(new Knight(Position.G1));
		// Bishops
		pieces.add(new Bishop(Position.C1));
		pieces.add(new Bishop(Position.F1));
		// Queen
		pieces.add(new Queen(Position.D1));
		// King
		pieces.add(new King(Position.E1));
	}
}
