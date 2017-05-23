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
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_player1Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 1 incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_player1Scored2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 2 incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_player1Scored3() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 3 incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_player2Scored() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 2 scored 1 incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_player2Scored2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 2 scored 2 incorrect", "0 - 30", score);	
	}

	@Test
	public void test_player2Scored3() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 2 scored 3 incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_player1Scored1player2Scored1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 1 Player 2 scored 1 incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_player1Scored2player2Scored1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 2 Player 2 scored 1 incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_player1Scored3player2Scored1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 3 Player 2 scored 1 incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_player1Scored1player2Scored2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 1 Player 2 scored 2 incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_player1Scored1player2Scored3() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 1 Player 2 scored 3 incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_player1Scored2player2Scored3() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 2 Player 2 scored 3 incorrect", "30 - 40", score);	
	}
	
	@Test
	public void test_player1Scored3player2Scored2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 3 Player 2 scored 2 incorrect", "40 - 30", score);	
	}
	
	@Test
	public void test_deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 3 Player 2 scored 3 incorrect deuce", "deuce", score);	
	}
	
	@Test
	public void test_advantagePlayer1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 4 Player 2 scored 3 incorrect- advantage player 1", "advantage Player 1", score);	
	}
	
	@Test
	public void test_advantagePlayer2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player2Scored();
		String score = game.getScore();
		
		assertEquals("Player 1 scored 4 Player 2 scored 3 incorrect- advantage player 2", "advantage Player 2", score);	
	}
	
	@Test
	public void test_player1wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		//game.player2Scored();
		game.player1Scored();
		//game.player1Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 3 Player 2 scored 2 incorrect- wins player 1", "win Player 1", score);	
	}
	
	@Test
	public void test_player2wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		//game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		//game.player2Scored();
		String score = game.getScore();
		assertEquals("Player 1 scored 2 Player 2 scored 3 incorrect- wins player 2", "win Player 2", score);	
	}
	
	

}
