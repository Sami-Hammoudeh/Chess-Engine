package chess.board;

public class Position {

	private int column;
	private int row;

	public Position(int column, int row) {
		setColumn(column);
		setRow(row);
	}

	public Position(char column, int row) {
		column = charToInt(column);
		setColumn(column);
		setRow(row);
	}

	private char charToInt(char column) {
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
		default:
			return 8;
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

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public boolean equals(Position position) {
		return column == position.getColumn() && row == position.getRow();
	}

}
