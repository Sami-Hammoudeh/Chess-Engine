package chess.collection;

import java.util.Iterator;
import java.util.LinkedList;
import chess.board.Position;

public class ChessLinkedList<E extends Position> extends LinkedList<E> {

	private static final long serialVersionUID = 1L;

	public boolean equals(ChessLinkedList<E> chessLinkedList) {
		if (size() != chessLinkedList.size())
			return false;
		return true;
	}

	public ChessLinkedList<E> copy() {
		return null;
	}

}
