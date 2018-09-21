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
		fieldOne = new StartField("Start");
		fieldOne.setFieldNumber(1);		
		fieldTwo = new StreetField("first street", 15000);
		fieldTwo.setFieldNumber(2);
		try {
			board.addField(fieldOne);
			board.addField(fieldTwo);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void verifySetup() {
		assertTrue(fieldOne.getName().equals("Start"));
		assertTrue(fieldTwo.getName().equals("first street"));
		assertTrue(playerOne.getName().equals("playerOne"));
		assertTrue(playerTwo.getName().equals("Player"));
		assertTrue(board.getOwnerNumberFromField(1)==null);
		assertTrue(board.getOwnerNumberFromField(2)==null);
	}
	
	@Test
	public void hasOwner()
	{
		fieldOne.setPlayer(playerOne);
		assertTrue(fieldOne.getPlayer().getName().equals(playerOne.getName()));
	}
	
	@Test
	public void hasFields() 
	{
		assertTrue(board.getFieldamount()==2);
	}

}
