package chess.board;

import chess.exception.ChessException;

public class Position {

	private int column;
	private int row;

	public Position(int column, int row) throws ChessException {
		setColumn(column);
		setRow(row);
	}

	public Position(char column, int row) throws ChessException {
		column = charToInt(column);
		setColumn(column);
		setRow(row);
	}

	private char charToInt(char column) throws ChessException {
		column = Character.toUpperCase(column);
		switch (column) {
		case 'A':
			return 1;
		case 'B':
			return 2;
		case 'C':
			return 3;
		case 'D':
			return 4;
		case 'E':
			return 5;
		case 'F':
			return 6;
		case 'G':
			return 7;
		case 'H':
			return 8;
		default:
			throw new ChessException(ChessException.IllegalPosition);
		}
	}

	public int getColumn() {
		return column;
	}

	public char getColumnAsChar() {
		switch (column) {
		case 1:
			return 'A';
		case 2:
			return 'B';
		case 3:
			return 'C';
		case 4:
			return 'D';
		case 5:
			return 'E';
		case 6:
			return 'F';
		case 7:
			return 'G';
		default:
			return 'H';
		}
	}

	public void setColumn(int column) throws ChessException {
		if (column < 1 || column > 8)
			throw new ChessException(ChessException.IllegalPosition);
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) throws ChessException {
		if (row < 1 || row > 8)
			throw new ChessException(ChessException.IllegalPosition);
		this.row = row;
	}

}
