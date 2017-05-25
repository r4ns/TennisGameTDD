package main;

public class TennisGame {
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;

	public TennisGame() {
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}

	public void player1Scores() throws TennisGameException {

		getScore(); // Make sure to have latest score status

		if (gameEnded)
			throw new TennisGameException("Can't score, game is ended");
		

		++player1Points;
	}

	public void player2Scores() throws TennisGameException{
		
		getScore(); // Make sure to have latest score status

		if (gameEnded)
			throw new TennisGameException("Can't score, game is ended");

		++player2Points;
	}

	public String convertScore(int score) {
		switch (score) {
		case 0:
			return "0";
		case 1:
			return "15";
		case 2:
			return "30";
		case 3:
			return "40";
		default:
			return "";
		}
	}

	public String getScore() throws TennisGameException {
		if (gameEnded)
			throw new TennisGameException("GAME ENDED!");

		if (convertScore(player1Points).equals("") && !convertScore(player2Points).equals("")
				&& !convertScore(player2Points).equals("40")) {
			gameEnded = true;
			return "Game player 1";
		}

		else if (convertScore(player2Points).equals("") && !convertScore(player1Points).equals("")
				&& !convertScore(player1Points).equals("40")) {
			gameEnded = true;
			return "Game player 2";
		}

		else if (convertScore(player1Points).equals("40") && convertScore(player2Points).equals("40"))
			return "deuce";

		else if (convertScore(player1Points).equals("") && convertScore(player2Points).equals("40")
				&& Math.abs(player1Points - player2Points) == 1)
			return "Advantage player 1";

		else if (convertScore(player2Points).equals("") && convertScore(player1Points).equals("40")
				&& Math.abs(player1Points - player2Points) == 1)
			return "Advantage player 2";

		else if (convertScore(player1Points).equals("") && convertScore(player2Points).equals("40")
				&& Math.abs(player1Points - player2Points) == 2) {
			gameEnded = true;
			return "Game player 1";
		}

		else if (convertScore(player1Points).equals("40") && convertScore(player2Points).equals("")
				&& Math.abs(player1Points - player2Points) == 2) {
			gameEnded = true;
			return "Game player 2";
		}

		return convertScore(player1Points) + " - " + convertScore(player2Points);
	}
}
