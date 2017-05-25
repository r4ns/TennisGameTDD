package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {
	
	TennisGame game;
	
	@Test
	public void test_StartScore() throws TennisGameException{
		game = new TennisGame();
		String score = game.getScore() ;
		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_player1_is_leading_15_0() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		assertEquals("Score incorrect", "15 - 0", game.getScore());
	}
	
	@Test
	public void test_player1_is_leading_30_0() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Score incorrect", "30 - 0", game.getScore());
	}
	
	@Test
	public void test_player1_is_leading_40_0() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Score incorrect", "40 - 0", game.getScore());
	}
	
	@Test
	public void test_player2_is_leading_15_0() throws TennisGameException{
		game = new TennisGame();
		game.player2Scores();
		assertEquals("Score incorrect", "0 - 15", game.getScore());
	}
	
	@Test
	public void test_player2_is_leading_30_0() throws TennisGameException{
		game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "0 - 30", game.getScore());
	}
	
	@Test
	public void test_player2_is_leading_40_0() throws TennisGameException{
		game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "0 - 40", game.getScore());
	}
	
	@Test
	public void test_score_15_15() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "15 - 15", game.getScore());
	}
	
	@Test
	public void test_score_30_15() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "30 - 15", game.getScore());
	}
	
	@Test
	public void test_score_40_15() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "40 - 15", game.getScore());
	}
	
	@Test
	public void test_score_15_30() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "15 - 30", game.getScore());
	}
	
	@Test
	public void test_score_15_40() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "15 - 40", game.getScore());
	}
	
	@Test
	public void test_score_30_40() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "30 - 40", game.getScore());
	}
	
	@Test
	public void test_score_40_30() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Score incorrect", "40 - 30", game.getScore());
	}
	
	@Test
	public void test_score_deuce() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		
		assertEquals("Incorrect score, should be deuce", "deuce", game.getScore());
	}
	
	@Test
	public void test_player1_has_advantage() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player2Scores();
		game.player1Scores();
		game.player2Scores();
		game.player1Scores();
		game.player2Scores();
		game.player1Scores();
		
		assertEquals("Incorrect score, player1 should have advantage", 
				"Advantage player 1", 
				game.getScore());
	}
	
	@Test
	public void test_player2_has_advantage() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player2Scores();
		game.player1Scores();
		game.player2Scores();
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		
		assertEquals("Incorrect score, player2 should have advantage", 
				"Advantage player 2", 
				game.getScore());
	}
	
	@Test
	public void test_player1_won_game() throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertEquals("Match should be ended, player1 won", "Game player 1", game.getScore());
	}
	
	@Test
	public void test_player2_won_game() throws TennisGameException{
		game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		assertEquals("Match should be ended, player2 won", "Game player 2", game.getScore());
	}
	
	@Test(expected=TennisGameException.class)
	public void test_exception_when_player1_scores_and_game_is_ended()throws TennisGameException{
		game = new TennisGame();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
	    game.player1Scores();
	}
	
	@Test(expected=TennisGameException.class)
	public void test_exception_when_player2_scores_and_game_is_ended()throws TennisGameException{
		game = new TennisGame();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
	    game.player2Scores();
	}
	


}
