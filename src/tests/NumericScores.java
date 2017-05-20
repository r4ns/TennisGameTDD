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
	public void test_score_15_0()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		
		String score = game.getScore();
		String expected = "15 - 0";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_30_0()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		String expected = "30 - 0";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_40_0()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		String expected = "40 - 0";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_0_15()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		
		
		String score = game.getScore();
		
		String expected = "0 - 15";
		assertEquals(expected, score);
	}
	
	
	@Test
	public void test_score_0_30()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "0 - 30";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_0_40()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "0 - 40";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_15_15()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		
		
		String score = game.getScore();
		
		String expected = "15 - 15";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_30_15()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		String expected = "30 - 15";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_40_15()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		String expected = "40 - 15";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_15_30()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		
		game.player2Scored();
				
		String score = game.getScore();
		
		String expected = "15 - 30";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_15_40()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "15 - 40";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_30_40()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "30 - 40";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_40_30()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player1Scored();
		
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "40 - 30";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_score_40_40()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "deuce";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player1_advantage()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		
		String score = game.getScore();
		
		String expected = "player1 advantage";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_advantage()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		
		String score = game.getScore();
		
		String expected = "player2 advantage";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player1_WIN()throws TennisGameException{
		TennisGame game = new TennisGame();
	
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
	
		game.player1Scored();
		
		String score = game.getScore();
		
		String expected = "player1 WIN";
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_WIN()throws TennisGameException{
		TennisGame game = new TennisGame();
	
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		
		
	
		
		String score = game.getScore();
		
		String expected = "player2 WIN";
		assertEquals(expected, score);
	}
	
	
	@Test(expected=TennisGameException.class)
	public void test_player1_make_Exception()throws TennisGameException{
		TennisGame game = new TennisGame();
	
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
	}
	
	@Test(expected=TennisGameException.class)
	public void test_player2_make_Exception()throws TennisGameException{
		TennisGame game = new TennisGame();
	
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
	}
	
	@Test
	public void test_player1_have_advantage_and_player1_win_point()throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		
		game.player2Scored();
		
		String expected = ("deuce");
		String score=game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_have_advantage_and_player1_win_point()throws TennisGameException{
		TennisGame game= new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		
		game.player1Scored();
		
		String expected = "deuce";
		String score=game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_have_advantage_and_player1_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		
		game.player1Scored();
		
		game.player1Scored();
		game.player1Scored();
		
		String expected = "player1 WIN";
		String score=game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_win_0_then_player1_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String expected="player1 WIN";
		String score= game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_win_15_then_player1_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String expected="player1 WIN";
		String score= game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player2_win_30_then_player1_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String expected="player1 WIN";
		String score= game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player1_win_0_then_player2_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
	
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected="player2 WIN";
		String score= game.getScore();
		
		assertEquals(expected, score);
	}
	@Test
	public void test_player1_win_15_then_player2_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected="player2 WIN";
		String score= game.getScore();
		
		assertEquals(expected, score);
	}
	
	@Test
	public void test_player1_win_30_then_player2_win_game()throws TennisGameException{
		TennisGame game= new TennisGame();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected="player2 WIN";
		String score= game.getScore();
		
		assertEquals(expected, score);
	}
}
