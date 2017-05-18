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
	public void test_Player1ScoredThreeTimes(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored three time", "40 - 0", score);
	}
	@Test
	public void test_Player2ScoreOneTime(){
		game=new TennisGame();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored one time", "0 - 15", score);
	}
	
	@Test
	public void test_Player2ScoredTwoTimes(){
		game=new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored two time", "0 - 30", score);
	}
	@Test
	public void test_Player2ScoredThreeTimes(){
		game=new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored three time", "0 - 40", score);
	}
	
	@Test
	public void test_1and2ScoresOneTimes(){
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 and player two scored one time", "15 - 15", score);
	}
	@Test
	public void test_1ScoredTwoAnd2ScoredOneTime(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored two and player two scored one time", "30 - 15", score);
	}
	@Test
	public void test_1ScoredThreeAnd2ScoredOneTime(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored three and player two scored one time", "40 - 15", score);
	}
	@Test
	public void test_2ScoredTwoAnd1ScoredOneTime(){
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored two and player two scored one time", "15 - 30", score);
	}
	@Test
	public void test_2ScoredThreeAnd1ScoredOneTime(){
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored three and player two scored one time", "15 - 40", score);
	}
	@Test
	public void test_2ScoredThreeAnd1ScoredTwoTime(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored three and player two scored two time", "30 - 40", score);
	}
	@Test
	public void test_1ScoredThreeAnd2ScoredTwoTime(){
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("", "40 - 30", score);
	}
	@Test
	public void test_Deuce(){
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("", "deuce", score);
	}
	@Test
	public void test_AdvantagePlayer1(){
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("", "advantage player 1", score);
	}
	
	
	

}
