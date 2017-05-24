package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {
	
	@Test
	public void test_StartScore() {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;
		assertEquals("Incorrect score", "0 - 0", score);	
	}
	
	@Test
	public void test_Player1ScoresFirst() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scores();
		assertEquals("Incorrect score", "15 - 0", game.getScore());
	}
	
	@Test
	public void test_Player1ScoresFirstTwice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "30 - 0", game.getScore());
	}
	
	@Test
	public void test_Player1ScoresFirstThreeTimes() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "40 - 0", game.getScore());
	}

	@Test
	public void test_Player2ScoresFirst() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		assertEquals("Incorrect score", "0 - 15", game.getScore());
	}
	
	@Test
	public void test_Player2ScoresFirstTwice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Incorrect score", "0 - 30", game.getScore());
	}
	
	@Test
	public void test_Player2ScoresFirstThreeTimes() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Incorrect score", "0 - 40", game.getScore());
	}
	
	@Test
	public void test_BothPlayersScoreOne() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "15 - 15", game.getScore());
	}
	
	@Test
	public void test_Player1ScoreTwoPlayer2ScoreOne() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "30 - 15", game.getScore());
	}
	
	@Test
	public void test_Player1ScoreThreePlayer2ScoreOne() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "40 - 15", game.getScore());
	}
	
	@Test
	public void test_Player1ScoreOnePlayer2ScoreTwo() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "15 - 30", game.getScore());
	}
	
	@Test
	public void test_Player1ScoreOnePlayer2ScoreThree() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "15 - 40", game.getScore());
	}
	
	@Test
	public void test_Player1ScoreTwoPlayer2ScoreThree() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "30 - 40", game.getScore());
	}
	
	@Test
	public void test_Player1ScoreThreePlayer2ScoreTwo() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "40 - 30", game.getScore());
	}
	
	@Test
	public void test_Deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "deuce", game.getScore());
	}
	
	@Test
	public void test_Player1Adv() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Incorrect score", "player1 advantage", game.getScore());
	}
	
	@Test
	public void test_Player2Adv() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		System.out.println(game.getScore());
		assertEquals("Incorrect score", "player2 advantage", game.getScore());
	}
	
	@Test (expected = TennisGameException.class)
	public void test_Player1Win() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
	}
	
	@Test (expected = TennisGameException.class)
	public void test_Player2Win() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
	}
}
