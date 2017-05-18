package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore()  throws TennisGameException{
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_StartPlayer1Score() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_StartPlayer2Score() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_Player1Score30() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_Player2Score30() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_Player1Score40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_Player2Score40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_Player1Score15Player2Score15() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_Player1Score30Player2Score15() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_Player1Score40Player2Score15() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_Player1Score15Player2Score30() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_Player1Score15Player2Score40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_Player1Score30Player2Score40()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	
	@Test
	public void test_Player1Score40Player2Score30() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	
	@Test
	public void test_deuce() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "deuce", score);	
	}
	
	@Test
	public void test_advantage1() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "advantage player1", score);	
	}
	
	@Test
	public void test_advantage2() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "advantage player2", score);	
	}
	
	@Test
	public void test_win1() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "win1", score);	
	}
	
	@Test
	public void test_win2()  throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "win2", score);	
	}
	
	@Test (expected = TennisGameException.class)
	public void test_ex2() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
	}
	
	@Test (expected = TennisGameException.class)
	public void test_ex1() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
	}

}
