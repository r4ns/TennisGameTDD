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
	public void test_PrviIgracVodi15nista() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_PrviIgracVodi30nista() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_PrviIgracVodi40nista() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_DrugiIgracVodi15nista() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_DrugiIgracVodi30nista() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_DrugiIgracVodi40nista() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 40", score);
	}
	
	@Test
	public void test__30_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	
	@Test
	public void test__40_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	
	@Test
	public void test__15_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test__15_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	@Test
	public void test__30_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 30", score);
	}
	
	@Test
	public void test__30_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	
	@Test
	public void test__40_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	
	@Test
	public void test__deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "deuce", score);
	}
	
	@Test
	public void test__advantage() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac1vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "advantage igrac1", score);
	}
	
	@Test
	public void test__Pobeda() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac1vodi();
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "pobedjuje igrac1", score);
	}
	
	@Test (expected=TennisGameException.class)
	public void test__Exception() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac1vodi();
		game.Igrac2vodi();
		game.Igrac2vodi();
		game.Igrac1vodi();
	}
}
