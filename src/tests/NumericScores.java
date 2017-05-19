package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	TennisGame game;
	
	@Test
	public void test_StartScore()  throws TennisGameException{
		 game= new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_FirstPlayer1Score15() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "15 - 0",score);
	}
	
	@Test
	public void test_FirstPlayer1Score30() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "30 - 0",score);
	}
	
	@Test
	public void test_FirstPlayer1Score40() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "40 - 0",score);
	}
	
	@Test
	public void test_FirstPlayer2Score15() throws TennisGameException{
		game= new TennisGame();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "0 - 15",score);
	}
	
	@Test
	public void test_FirstPlayer2Score30() throws TennisGameException{
		game= new TennisGame();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "0 - 30",score);
	}
	
	@Test
	public void test_FirstPlayer2Score4() throws TennisGameException{
		game= new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "0 - 40",score);
	}
	
	@Test
	public void test_FirstPlayer1Score15AndPlayer2Score15() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "15 - 15",score);
	}
	
	@Test
	public void test_FirstPlayer1Score30AndPlayer2Score15() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "30 - 15",score);
	}
	
	@Test
	public void test_FirstPlayer1Score40AndPlayer2Score15() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "40 - 15",score);
	}
	
	@Test
	public void test_FirstPlayer1Score15AndPlayer2Score30() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "15 - 30",score);
	}
	
	@Test
	public void test_FirstPlayer1Score15AndPlayer2Score40() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "15 - 40",score);
	}
	
	@Test
	public void test_FirstPlayer1Score30AndPlayer2Score40() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "30 - 40",score);
	}
	
	
	@Test
	public void test_FirstPlayer1Score40AndPlayer2Score30() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "40 - 30",score);
	}
	
	@Test
	public void test_Deuce() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "deuce",score);
	}
	
	@Test
	public void test_Advantage() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		game.player2Score();
		game.player2Score();
		game.player2Score();
		
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "advantage",score);
	}
	
	@Test
	public void test_Player1Wins() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		game.player2Score();
		game.player2Score();
		game.player2Score();
		
		game.player1Score();
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "player1 wins",score);
	}
	
	@Test
	public void test_Player2Wins() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		game.player2Score();
		game.player2Score();
		game.player2Score();
		
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("Score incorrect", "player2 wins",score);
	}
	
	@Test
	public void test_Exception() throws TennisGameException{
		game= new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		
		game.player2Score();
		game.player2Score();
		game.player2Score();
		
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
	}
	
}
