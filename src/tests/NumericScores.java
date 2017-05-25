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
	public void test_player1_15_player2_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_player1_30_player2_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_player1_40_player2_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_player2_15_player1_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
	
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_player2_30_player1_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
	
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_player2_40_player1_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
	
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 40", score);
	}
	
	
	@Test
	public void test_player1_15_player2_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	
	@Test
	public void test_player1_30_player2_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	
	
	@Test
	public void test_player1_40_player2_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	
	
	@Test
	public void test_player1_15_player2_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_player1_15_player2_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	
	@Test
	public void test_player1_30_player2_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	
	
	@Test
	public void test_player1_40_player2_30()  throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	
	
	@Test
	public void test_deuce() throws TennisGameException{
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
	public void test_player1Adv()  throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "adv1", score);
	}
	
	
	@Test
	public void test_player2Adv()  throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "adv2", score);
	}
	
	
	@Test
	public void test_player1Win()  throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "win1", score);
	}
	
	@Test
	public void test_player2Win() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
				
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "win2", score);
	}
	
	@Test (expected = TennisGameException.class)
	public void test_Exception()  throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
			
		
		
	}
	
	
	
	
	
	
	
	

	
	
}
