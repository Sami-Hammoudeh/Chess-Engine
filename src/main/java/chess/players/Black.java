package chess.players;

import java.util.HashSet;

import chess.board.Position;
import chess.exception.ChessException;
import chess.pieces.*;

public class Black {
	private HashSet<Piece> pieces;

	public Black() {
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
		pieces.add(new Pawn(Position.A7));
		pieces.add(new Pawn(Position.B7));
		pieces.add(new Pawn(Position.C7));
		pieces.add(new Pawn(Position.D7));
		pieces.add(new Pawn(Position.E7));
		pieces.add(new Pawn(Position.F7));
		pieces.add(new Pawn(Position.G7));
		pieces.add(new Pawn(Position.H7));
		// Rooks
		pieces.add(new Rook(Position.A8));
		pieces.add(new Rook(Position.H8));
		// Knights
		pieces.add(new Knight(Position.B8));
		pieces.add(new Knight(Position.G8));
		// Bishops
		pieces.add(new Bishop(Position.C8));
		pieces.add(new Bishop(Position.F8));
		// Queen
		pieces.add(new Queen(Position.D8));
		// King
		pieces.add(new King(Position.E8));
	}
}
