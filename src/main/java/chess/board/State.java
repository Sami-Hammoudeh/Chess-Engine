package chess.board;

import chess.pieces.Piece;
import chess.players.Color;

public class State {
	private Piece[][] positions;
	private Color turn;

	public State() {
		positions = new Piece[8][8];
	}

	public State(Piece[][] positions, Color turn) {
		this();
		setPositions(positions);
		setTurn(turn);
	}

	public Piece[][] getPositions() {
		return positions;
	}

	public void setPositions(Piece[][] positions) {
		this.positions = positions;
	}

	public Color getTurn() {
		return turn;
	}

	public void setTurn(Color turn) {
		this.turn = turn;
	}

}
