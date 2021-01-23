package chess.board;

import chess.object.ChessObject;

public class Position extends ChessObject {

	private int column;
	private int row;

	public Position(int column, int row) {
		setColumn(column);
		setRow(row);
	}

	public Position(char column, int row) {
		this(charToInt(column), row);
	}

	private static int charToInt(char column) {
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
			return 9;
		}
	}

	public int getColumn() {
		return column;
	}

	public Character getColumnAsChar() {
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
		case 8:
			return 'H';
		default:
			return null;
		}
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public Position addRows(int rows) {
		return new Position(column, rows + row);
	}

	public Position addColums(int colums) {
		return new Position(colums + column, row);
	}

	@Override
	public boolean equals(ChessObject co) {
		if (co == this)
			return true;
		if (co == null || co.getClass() != getClass())
			return false;
		Position position = (Position) co;
		return position.getColumn() == getColumn() && position.getRow() == getRow();
	}

	@Override
	public ChessObject copy() {
		return new Position(getColumn(), getRow());
	}

}
