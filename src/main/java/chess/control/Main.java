package chess.control;

import chess.board.Board;
import chess.players.Black;
import chess.players.White;

public class Main {
	public static Board BOARD;
	public static White WHITE;
	public static Black BLACK;

	public static void main(String[] args) {
		initialize();
	}

	private static void initialize() {
		BOARD = new Board();
		WHITE = new White();
		BLACK = new Black();
	}
}
