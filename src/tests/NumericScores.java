package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;

// Testing of midgame scores before both players score three times
public class NumericScores {
	
	TennisGame game;

	
	@Test
	public void test_StartScore() {
		game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_Player1ScoreOneTime(){
		game=new TennisGame();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored one time", "15 - 0", score);
	}
	
	@Test
	public void test_Player1ScoredTwoTimes(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored two time", "30 - 0", score);
	}
	
	@Test
	public void test_Player1ScoredTimes(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored two time", "30 - 0", score);
	}
	
	
	

}
