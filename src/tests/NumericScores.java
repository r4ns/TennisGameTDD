package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	@Test
	public void test_StartScore() throws TennisGameException {
		TennisGame game = new TennisGame();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 0", score);
	}

	@Test
	public void testPlayer1Scores1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("15 - 0", score);
	}

	@Test
	public void testPlayer2Scores1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("0 - 15", score);
	}

	@Test
	public void testPlayer1Scores2Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("30 - 0", score);
	}

	@Test
	public void testPlayer2Scores2Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("0 - 30", score);
	}

	@Test
	public void testPlayer1Scores3Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("40 - 0", score);
	}

	@Test
	public void testPlayer2Scores3Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("0 - 40", score);
	}

	@Test
	public void testPlayer1Scores1PointPlayer2Scores1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("15 - 15", score);
	}
	
	@Test
	public void testPlayer1Scores2PointsPlayer2Scores1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("30 - 15", score);
	}
	
	@Test
	public void testPlayer1Scores1PointPlayer2Scores2Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("15 - 30", score);
	}
	
	@Test
	public void testPlayer1Scores3PointsPlayer2Scores1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("40 - 15", score);
	}
	
	@Test
	public void testPlayer1Scores1PointPlayer2Scores3Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("15 - 40", score);
	}

	@Test
	public void testPlayer1Scores2PointsPlayer2Scores2Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("30 - 30", score);
	}
	
	@Test
	public void testPlayer1Scores3PointsPlayer2Scores2Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("40 - 30", score);
	}
	
	@Test
	public void testPlayer1Scores2PointsPlayer2Scores3Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("30 - 40", score);
	}

	@Test
	public void testPlayer1Scores3PointsPlayer2Scores3Points_deuce() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("deuce", score);
	}

	@Test
	public void testAdvantageForPlayer1() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("advantage player1", score);
	}

	@Test
	public void testAdvantageForPlayer2() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("advantage player2", score);
	}
	
	@Test
	public void testPlayer1Won() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("game player1", score);
	}
	
	@Test
	public void testPlayer2Won() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("game player2", score);
	}
	
	@Test(expected=TennisGameException.class)
	public void testPlayer1WantsToScoreWhenGameHasAlreadyEnded() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
	}
	
	@Test(expected=TennisGameException.class)
	public void testPlayer2WantsToScoreWhenGameHasAlreadyEnded() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
	}

}
