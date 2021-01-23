package chess.collections;

import java.util.Iterator;
import java.util.LinkedList;
import chess.object.ChessObject;

public class ChessLinkedList<E extends ChessObject> extends LinkedList<ChessObject>
		implements ChessCollection<ChessObject> {

	private static final long serialVersionUID = 1L;

	public boolean equals(ChessCollection<ChessObject> list) {
		if (list == this)
			return true;
		if (list == null || list.getClass() != getClass())
			return false;
		ChessLinkedList<ChessObject> linkedList = (ChessLinkedList<ChessObject>) list;
		if (linkedList.size() != size())
			return false;
		Iterator<ChessObject> i1 = linkedList.iterator();
		Iterator<ChessObject> i2 = iterator();
		while (i1.hasNext() && i2.hasNext())
			if (!(i1.next().equals(i2.next())))
				return false;
		return true;
	}

	public ChessCollection<ChessObject> copy() {
		ChessLinkedList<ChessObject> list = new ChessLinkedList<ChessObject>();
		Iterator<ChessObject> iterator = iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}

}
