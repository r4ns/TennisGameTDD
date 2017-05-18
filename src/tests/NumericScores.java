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
	public void test_Score_15_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_Score_30_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_Score_40_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_Score_0_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_Score_0_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_Score_0_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_Score_15_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_Score_30_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_Score_40_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_Score_15_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_Score_15_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_Score_30_40() throws TennisGameException{
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
	public void test_Score_40_30() throws TennisGameException{
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
	public void test_Score_Deuce() throws TennisGameException{
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
	public void test_Score_Prednost1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "prednost igrac 1", score);	
	}
	
	@Test
	public void test_Score_Prednost2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "prednost igrac 2", score);	
	}
	
	@Test
	public void test_Score_Mec1() throws TennisGameException{
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

		assertEquals("Initial score incorrect", "mec igrac 1", score);	
	}
	
	@Test
	public void test_Score_Mec2() throws TennisGameException{
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

		assertEquals("Initial score incorrect", "mec igrac 2", score);	
	}
	
	@Test (expected=TennisGameException.class)
	public void test_Score_Ex1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
	}
	
	@Test (expected=TennisGameException.class)
	public void test_Score_Ex2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
	}
}
