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
	public void test_score_15_0() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores first", "15 - 0", score);	
	}
	
	@Test
	public void test_score_30_0() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores twice", "30 - 0", score);	
	}
	
	@Test
	public void test_score_40_0() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores three times", "40 - 0", score);	
	}
	@Test
	public void test_score_0_15() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player2 scores first", "0 - 15", score);	
	}
	@Test
	public void test_score_0_30() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player2 scores twice", "0 - 30", score);	
	}
	
	@Test
	public void test_score_0_40() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player2 scores three times", "0 - 40", score);	
	}
	
	@Test
	public void test_score_15_15() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		
		String score = game.getScore() ;

		assertEquals("Player1 and player2 scores one time", "15 - 15", score);	
	}
	@Test
	public void test_score_30_15() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores 2 times and player2 one time", "30 - 15", score);	
	}
	@Test
	public void test_score_40_15() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores 3 times and player2 one time", "40 - 15", score);	
	}
	@Test
	public void test_score_40_30() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores 3 times and player2 two times", "40 - 30", score);	
	}
	@Test
	public void test_score_15_30() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores 1 time and player2 two times", "15 - 30", score);	
	}
	@Test
	public void test_score_15_40() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores 1 time and player2 three times", "15 - 40", score);	
	}
	
	@Test
	public void test_score_30_40() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 scores 2 times and player2 three times", "30 - 40", score);	
	}
	@Test
	public void test_score_40_40() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Deuce", "deuce", score);	
	}
	
	@Test
	public void test_score_advantagePlayer1() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 is advantage", "Player1 advantage", score);	
	}
/* 	@Test
	public void test_score_advantagePlayer2() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;

		assertEquals("Player2 is advantage", "Player2 advantage", score);	
	}*/
	
	@Test
	public void test_score_Player1_win() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Player1 is advantage", "Player1 wins", score);	
	}
	@Test
	public void test_score_Player2_win() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Player1 is advantage", "Player2 wins", score);	
	}
	
}
