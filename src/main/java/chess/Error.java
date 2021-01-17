package chess;

public enum Error {
	IllegalMove("Illegal Move");

	String errorMessage;

	private Error(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
