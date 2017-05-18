package tests;
import main.TennisGame;
import main.TennisGameException;

import static org.junit.Assert.*;

import org.junit.Test;


// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore() throws TennisGameException {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_player1Score() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("15:0 score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_player1ScoreTwice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		String score = game.getScore();
		
		assertEquals("30:0 score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_player1ScoreThree() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();

		String score = game.getScore();
		
		assertEquals("40:0 score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_player2Score() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("0:15 score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_player2ScoreTwice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		String score = game.getScore();
		
		assertEquals("0:30 score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_player2ScoreThree() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();

		String score = game.getScore();
		
		assertEquals("0:40 score incorrect", "0 - 40", score);
	}
	
	@Test
	public void test_player1Score_player2Score() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player2Score();

		String score = game.getScore();
		
		assertEquals("15:15 score incorrect", "15 - 15", score);
	}
	
	@Test
	public void test_player1ScoreTwice_Player2Score() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player2Score();

		String score = game.getScore();
		
		assertEquals("30:15 score incorrect", "30 - 15", score);
	}
	
	@Test
	public void test_player1ScoreThree_Player2Score() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();


		String score = game.getScore();
		
		assertEquals("40:15 score incorrect", "40 - 15", score);
	}
	
	@Test
	public void test_player1ScoreThree_player2ScoreTwice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player2Score();
		game.player2Score();

		String score = game.getScore();
		
		assertEquals("40:30 score incorrect", "40 - 30", score);
	}
	
	@Test
	public void test_player2ScoreTwice_player1Score() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player1Score();

		String score = game.getScore();
		
		assertEquals("15:30 score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_player2ScoreThree_player1Score() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();

		String score = game.getScore();
		
		assertEquals("15:40 score incorrect", "15 - 40", score);
	}
	
	@Test
	public void test_player2ScoreThree_player1ScoreTwice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();

		String score = game.getScore();
		
		assertEquals("30:40 score incorrect", "30 - 40", score);
	}
	
	@Test
	public void test_Deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player1Score();


		String score = game.getScore();
		
		assertEquals("Deuce score incorrect", "deuce", score);
	}
	
	@Test
	public void test_advantage1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player1Score();


		String score = game.getScore();
		
		assertEquals("Advantage1 score incorrect", "advantage player1", score);
	}
	
	@Test
	public void test_advantage2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		game.player1Score();
		game.player1Score();


		String score = game.getScore();
		
		assertEquals("Advantage2 score incorrect", "advantage player2", score);
	}
	
	@Test
	public void test_game1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Score();
		game.player1Score();
		game.player1Score();
		game.player1Score();


		String score = game.getScore();
		
		assertEquals("Game1 score incorrect", "game player1", score);
	}
	
	@Test
	public void test_game2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();

	
		String score = game.getScore();
		
		assertEquals("Game2 score incorrect", "game player2", score);
	}
	
	@Test
	public void test_Exceptrion() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player2Score();
		game.player1Score();
		
	}
		
	

}
