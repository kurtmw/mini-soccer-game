package model.players;

public class PlayerStatistics {

	protected int score;

	protected PlayerStatistics() {
		score = 0;
	}

	public int getStatistics() {
		return score;
	}

	public void setStatistics(int newScore) {
		score = newScore;
	}
}