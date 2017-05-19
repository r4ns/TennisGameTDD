package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;

// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore() {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	@Test
	public void test_PlayerOneScore() {
		TennisGame game = new TennisGame();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	@Test
	public void test_PlayerOneScoreTwo() {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	@Test
	public void test_PlayerOneScoreThree() {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	@Test
	public void test_PlayerTwoScore() {
		TennisGame game = new TennisGame();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	@Test
	public void test_PlayerTwoScoreTwo() {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	@Test
	public void test_PlayerTwoScoreThree() {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	@Test
	public void test_15All() {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	@Test
	public void test_3015Player2() {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	@Test
	public void test_3030All() {
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player1Score();
		game.player2Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 30", score);	
	}
	@Test
	public void test_4030Player1() {
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
	public void test_4030Player2() {
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
	public void test_4030Player1() {
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

}
