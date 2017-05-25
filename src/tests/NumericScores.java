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
	public void test_player1_Wins1Point_player2_Wins0Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	@Test 
	public void test_player1_Wins2Points_player2_Wins0Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		
		String score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	@Test 
	public void test_player1_Wins3Points_Player2_Wins0Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		
		String score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	@Test
	public void test_player1_Wins0Points_Player2_Wins1Point() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.setPlayer2Points();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	@Test
	public void test_player1_Wins0Points_Player2_Wins2Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	@Test
	public void test_pkater1_Wins0Points_Player2_Wins3Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 40", score);
	}
	@Test
	public void test_player1_Wins1Point_player2_Wins1Point() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	@Test
	public void test_player1_Wins2Points_player2_Wins1Point() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer1Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	@Test
	public void test_player1_Wins3Points_player2_Wins1Point() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	@Test
	public void test_player1_Wins1Point_player2_Wins2Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	@Test
	public void test_player1_Wins1Point_player2_Wins3Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	@Test
	public void test_player1_Wins2Point_player2_Wins2Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "30 - 30", score);
	}
	@Test
	public void test_player1_Wins2Point_player2_Wins3Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	@Test
	public void test_player1_Wins3Point_player2_Wins2Points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	@Test
	public void test_Deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "deuce", score);
	}
	@Test
	public void test_AdvantagdePlr1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer1Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "advantage player1", score);
	}
	@Test
	public void test_AdvantagdePlr2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "advantage player2", score);
	}
	@Test
	public void test_Plr1Wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "game player1", score);
	}
	@Test
	public void test_Plr2Wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer1Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		game.setPlayer2Points();
		
		String score = game. getScore();
		assertEquals("Initial score incorrect", "game player2", score);
	}
	@Test(expected=TennisGameException.class)
	 public void test_ThrowExceptionPlr2() throws TennisGameException {
	 		TennisGame game = new TennisGame();
	 		game.setPlayer1Points();
			game.setPlayer1Points();
			game.setPlayer1Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
	 		String score = game.getScore() ;
	 	}
	@Test(expected=TennisGameException.class)
	 public void test_ThrowExceptionPlr1() throws TennisGameException {
	 		TennisGame game = new TennisGame();
	 		game.setPlayer1Points();
			game.setPlayer1Points();
			game.setPlayer1Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer2Points();
			game.setPlayer1Points();
			game.setPlayer1Points();
			game.setPlayer1Points();
	 		String score = game.getScore() ;
	 	}
	 


}