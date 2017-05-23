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
	public void test_Score_15_0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_Score_30_0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_Score_40_0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_Score_40_15() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_Score_40_30() throws TennisGameException {
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
	public void test_Score_0_15() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_Score_0_30() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_Score_0_40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_Score_15_40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_Score_30_40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	
	@Test
	public void test_Score_40_40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "deuce", score);	
	}
	
	@Test
	public void test_Score_advantage_40() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "advantage player1", score);	
	}
	
	@Test
	public void test_Score_40_advantage() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "advantage player2", score);	
	}
	
	@Test
	public void test_Score_gameEndPlayer1() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "game player1", score);	
	}
	
	@Test
	public void test_Score_gameEndPlayer2() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "game player2", score);	
	}

}
