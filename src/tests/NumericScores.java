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
		String score = game.score() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_player1_15_player2_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_player1_30_player2_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_player1_40_player2_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_player1_0_player2_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_player1_0_player2_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_player1_0_player2_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "0 - 40", score);
	}
	
	@Test
	public void test_player1_30_player2_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_player1_40_player2_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	@Test
	public void test_player1_40_player2_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	
	@Test
	public void test_player1_40_player2_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	
	@Test
	public void test_duece() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "duece", score);
	}
	
	@Test
	public void test_advantage_player1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "advantage player1", score);
	}
	
	@Test
	public void test_advantage_player2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "advantage player2", score);
	}
	
	@Test
	public void test_game_player2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "game player2", score);
	}
	
	@Test
	public void test_game_player1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "game player1", score);
	}
	
	@Test
	public void test_game_player1_after_advantage() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.score();
		
		assertEquals("Initial score incorrect", "game player1", score);
	}
	
	@Test(expected = TennisGameException.class)
	public void exception() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
	}
	
	

}
