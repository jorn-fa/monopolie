import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Fields.*;
import Parts.Player;


public class BoardTest {
	
	private Board board;
	private Player playerOne;
	private Player playerTwo;
	private Field fieldOne;
	private Field fieldTwo;
	
	@Before
	public void setUp() {
		board =new Board();
		playerOne = new Player("playerOne",1);
		playerTwo = new Player("Player","Two",2);
		fieldOne = new Field("Start");
		fieldTwo = new StreetField("first street", 15000);
		board.addField(fieldOne);
		board.addField(fieldTwo);
	}
	
	@Test
	public void verifySetup() {
		assertTrue(fieldOne.getName().equals("Start"));
		assertTrue(fieldTwo.getName().equals("first street"));
		assertTrue(playerOne.getName().equals("playerOne"));
		assertTrue(playerTwo.getName().equals("Player"));
		assertTrue(board.getOwnerNumberFromField(1)==0);
		assertTrue(board.getOwnerNumberFromField(0)==0);
	}

}
