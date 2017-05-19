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
	public void test_firstPlayer1Point_secondPlayer0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_firstPlayer2Point_secondPlayer0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_firstPlayer3Point_secondPlayer0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_firstPlayer0_secondPlayer1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Score();		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_firstPlayer0_secondPlayer2Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_firstPlayer0_secondPlayer3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_firstPlayer1Point_secondPlayer1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_firstPlayer2Point_secondPlayer1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_firstPlayer3Point_secondPlayer1Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_firstPlayer1Point_secondPlayer2Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_firstPlayer1Point_secondPlayer3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_firstPlayer3Point_secondPlayer2Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	
	@Test
	public void test_firstPlayer2Point_secondPlayer3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	
	@Test
	public void test_firstPlayer3Point_secondPlayer3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "deuce", score);	
	}
	
	@Test
	public void test_firstPlayer4Point_secondPlayer3Point() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "Advantage player1", score);	
	}
	
	@Test
	public void test_firstPlayerWins() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "player1 wins", score);	
	}
	
	@Test
	public void test_firstPlayer3Points_secondPlayer4Points() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "Advantage player2", score);	
	}
	
	@Test
	public void test_secondPlayerWins() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "player2 wins", score);	
	}
	
	@Test(expected = TennisGameException.class)
	public void test_exception() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();

	}

}
