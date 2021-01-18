package chess.board;

public enum Position {
	A1(1), A2(2), A3(3), A4(4), A5(5), A6(6), A7(7), A8(8),
	B1(1), B2(2), B3(3), B4(4), B5(5), B6(6), B7(7), B8(8),
	C1(1), C2(2), C3(3), C4(4), C5(5), C6(6), C7(7), C8(8),
	D1(1), D2(2), D3(3), D4(4), D5(5), D6(6), D7(7), D8(8),
	E1(1), E2(2), E3(3), E4(4), E5(5), E6(6), E7(7), E8(8),
	F1(1), F2(2), F3(3), F4(4), F5(5), F6(6), F7(7), F8(8),
	G1(1), G2(2), G3(3), G4(4), G5(5), G6(6), G7(7), G8(8),
	H1(1), H2(2), H3(3), H4(4), H5(5), H6(6), H7(7), H8(8);
	
	private int row;
	private Position(int row) {
		this.row=row;
	}
	
	public int getRow() {
		return this.row;
	}
}
