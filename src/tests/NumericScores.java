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

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_player1Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 1 incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_player1_30player2_0Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("30-0 incorect", "30 - 0", score);	
	}
	@Test
	public void test_player1_40player2_0Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("40-0 incorect", "40 - 0", score);	
	}
	@Test
	public void test_player2Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 2 scored 2 incorrect", "0 - 15", score);	
	}
	@Test
	public void test_player2_30_player1_0Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("0-30 incorrect", "0 - 30", score);	
	}
	@Test
	public void test_player2_40_player1_0Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("0-40 incorrect", "0 - 40", score);	
	}
	@Test
	public void test_player2_15_player1_15Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		
		String score = game.getScore();
		assertEquals("15-15 incorrect", "15 - 15", score);	
	}
	@Test
	public void test_30_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		
		String score = game.getScore();
		assertEquals("15-30 incorrect", "15 - 30", score);	
	}
	@Test
	public void test_40_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		
		String score = game.getScore();
		assertEquals("15-40 incorrect", "15 - 40", score);	
	}
	@Test
	public void test_15_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		
		
		String score = game.getScore();
		assertEquals("30-15 incorrect", "30 - 15", score);	
	}
	@Test
	public void test_15_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		
		
		String score = game.getScore();
		assertEquals("40-15 incorrect", "40 - 15", score);	
	}
	@Test
	public void test_deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		/*game.player2Scored();
		game.player1Scored();*/
		String score = game.getScore();
		assertEquals("deuce incorrect", "deuce", score);	
	}
	@Test
	public void test_deuce2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("deuce incorrect", "deuce", score);	
	}
	@Test
	public void test_adventage1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("adventage1 incorrect", "adventagePlayer1", score);	
	}
	@Test
	public void test_adventage2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("adventage2 incorrect", "adventagePlayer2", score);	
	}
	@Test
	public void test_win2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("win2 incorrect", "WinPlayer2", score);	
	}
	@Test
	public void test_win1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("win1 incorrect", "WinPlayer1", score);	
	}
	@Test (expected = TennisGameException.class)
 	public  void test_Exception() throws TennisGameException {
 		TennisGame game = new TennisGame();
 		game.player1Scored();
 		game.player1Scored();
 		game.player1Scored();
 		game.player1Scored();
 		game.player1Scored();
 		String score = game.getScore();		
 		
 	}
}
