package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore() throws TennisGameException{
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_player1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_player2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_player1SameAsplayer2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;
		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	@Test
	public void test_player130() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	@Test
	public void test_player140() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_player230() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_player240()throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_player130_player215()throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_player140_player215()throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	
	@Test
	public void test_player115_player230() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_player115_player240()throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_player130_player240()throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	
	@Test
	public void test_player140_player230() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	
	@Test
	public void test_player140_player240() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "deuce", score);	
	}
	
	@Test
	public void test_player1adventage()throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "advantage 1", score);	
	}
	
	@Test
	public void test_player2adventage() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "advantage 2", score);	
	}
	
	@Test
	public void test_playerBacktoDeuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "deuce", score);	
	}
	
	@Test
	public void test_player1Wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "player1 wins", score);	
	}
	
	@Test
	public void test_player2Wins() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();

	
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "player2 wins", score);	
	}
	
	@Test(expected=TennisGameException.class)
	public void test_exception2() throws TennisGameException{
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
	}
	
	@Test(expected=TennisGameException.class)
	public void test_exception1() throws TennisGameException{
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
	}
	
	


}
