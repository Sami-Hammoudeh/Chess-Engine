package chess.players;

public enum Color {
	WHITE(1), BLACK(-1);

	private int value;

	private Color(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
