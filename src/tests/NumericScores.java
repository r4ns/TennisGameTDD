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
	public void test_PlayerTwoScore() {
		TennisGame game = new TennisGame();
		game.player2Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	@Test
	public void test_PlayerOneScoreTwo() {
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	

}
