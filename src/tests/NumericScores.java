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
	public void test_PlayerOneScore()  throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	@Test
	public void test_PlayerOneScoreTwo()  throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	@Test
	public void test_PlayerOneScoreThree() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	@Test
	public void test_PlayerTwoScore() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	@Test
	public void test_PlayerTwoScoreTwo()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	@Test
	public void test_PlayerTwoScoreThree()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	@Test
	public void test_15All()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	@Test
	public void test_3015Player2()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	@Test
	public void test_3030All()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 30", score);	
	}
	@Test
	public void test_4030Player1()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	@Test
	public void test_4030Player2()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	@Test
	public void test_Deuce()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "deuce", score);	
	}
	@Test
	public void test_AdvantagePlayer1()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "advantage player1", score);	
	}
	@Test
	public void test_AdvantagePlayer2()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "advantage player2", score);	
	}
	@Test
	public void test_winPlayer2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "game player2", score);	
	}
	@Test
	public void test_winPlayer1()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "game player1", score);	
	}
	

}
