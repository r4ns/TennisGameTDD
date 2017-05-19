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
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_Player1Score1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_Player1Score2Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_Player1Score3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_Player2Score1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_Player2Score2Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_Player2Score3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 40", score);
	}
	
	@Test
	public void test_Player1Score1PointAndPlayer2Score1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	
	@Test
	public void test_Player1Score2PointAndPlayer2Score1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	
	@Test
	public void test_Player1Score3PointAndPlayer2Score1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	
	@Test
	public void test_Player1Score1PointAndPlayer2Score2Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_Player1Score1PointAndPlayer2Score3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	@Test
	public void test_Player1Score2PointAndPlayer2Score3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Inital score incorrect", "30 - 40", score);
	}
	
	@Test
	public void test_Player1Score3PointAndPlayer2Score2Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Inital score incorrect", "40 - 30", score);
	}
	
	@Test
	public void test_Deuce() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "deuce", score);
	}
	
	@Test
	public void test_AdvantagePlayer1() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "advantage player 1", score);
	}	
	
	@Test
	public void test_AdvantagePlayer2() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "advantage player 2", score);
	}
	
	@Test
	public void test_GamePlayer1() throws TennisGameException {
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
		
		assertEquals("Initial score incorrect", "game player 1", score);
	}
	
	@Test 
	public void test_GamePlayer2() throws TennisGameException {
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
		
		assertEquals("Initial score incorrect", "game player 2", score);
	}
	
	@Test (expected = TennisGameException.class)
	public void test_Exception() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();		
		
	}

}
