package chess.collections;

import chess.object.ChessObject;

public interface ChessCollection<E extends ChessObject> {

	public boolean equals(ChessCollection<E> chessCollection);

	public ChessCollection<E> copy();
}
