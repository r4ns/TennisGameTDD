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
	public void test_Deuce() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "deuce", score);	
	}
	
	@Test
	public void test_15_0() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_30_0() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_40_0() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_0_15() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_0_30() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_0_40() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	
	@Test
	public void test_adv2() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "advantage player 2", score);	
	}
	
	@Test
	public void test_adv1() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "advantage player 1", score);	
	}
	
	@Test
	public void test_15_15() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_30_15() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_15_30() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_30_30() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 30", score);	
	}
	
	@Test
	public void test_40_30() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	
	@Test
	public void test_30_40() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	
	
	@Test
	public void test_40_15() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_15_40() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 40", score);	
	}



}
