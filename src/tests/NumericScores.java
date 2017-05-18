package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {
	@Test
	public void test_StartScore() throws TennisGameException {
		
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_15_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 1points incorrect","15 - 0",score);
	}
	@Test
	public void test_30_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 2points incorrect","30 - 0",score);
	}
	@Test
	public void test_40_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 3points incorrect","40 - 0",score);
	}
	@Test
	public void test_0_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p2 wins 1points incorrect","0 - 15",score);
	}
	@Test
	public void test_0_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored(); 
		String score = game.getScore();
		assertEquals("Score after p2 wins 2points incorrect","0 - 30",score);
	}
	
	@Test
	public void test_0_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored(); 
		game.player2Scored(); 
		String score = game.getScore();
		assertEquals("Score after p2 wins 3points incorrect","0 - 40",score);
	}
	
	@Test
	public void test_15_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 won 1 point and p2 won 1 point incorrect","15 - 15",score);
	}
	
	@Test
	public void test_30_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 2 point and p2 won 1 point incorrect","30 - 15",score);
	}
	
	@Test
	public void test_40_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 3 point and p2 win 1 points incorrect","40 - 15",score);
	}
	
	@Test
	public void test_15_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 won 1 point and p2 wins 2 points incorrect","15 - 30",score);
	}
	
	@Test
	public void test_15_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 won 1 point and p2 wins 3 points incorrect","15 - 40",score);
	}
	
	@Test
	public void test_30_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 2 points and p2 wins 3 points incorrect","30 - 40",score);
	}
	
	@Test
	public void test_40_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 2 points and p2 wins 3 points incorrect","40 - 30",score);
	}
	@Test
	public void test_40_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 3 points and p2 wins 3 points incorrect","deuce",score);
	}
	
	@Test
	public void test_P1_wins_4points_p2_wins_4points() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Score after p1 wins 3 points and p2 wins 3 points and p1 wins 1 point and p2 wins 1point incorrect","deuce",score);
	}
	@Test
	public void advantage_player2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after player1 wins 3 points and player2 wins 4 points","advantage player2",score);
	}
	
	@Test
	public void advantage_player1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Score after player2 wins 3 points and player1 wins 4 points","advantage player1",score);
	}
	
	@Test
	public void p1_wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Score after playe1 wins 3 points and p2 wins none","game ended, p1 wins!",score);
	}
	public void p2_wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Score after playe2 wins 3 points and p2 wins none","game ended, p2 wins!",score);
	}
	
	@Test(expected = TennisGameException.class)
	public void p1_wins_5_points_exception () throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.getScore();
		game.player1Scored();
	}
}
