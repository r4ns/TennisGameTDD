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
	public void test_Player1ScoresFirst(){
		TennisGame game = new TennisGame();
		game.player1Scores();
		assertEquals("Player1 first scores incorrect", "15 - 0", game.getScore());
	}

}
