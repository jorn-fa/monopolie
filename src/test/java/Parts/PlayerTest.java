package Parts;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class PlayerTest {
	
	private static Player playerOne;
	private static Player playerTwo;
	
	
	@Before
	public void setUp() {
		playerOne = new Player("One");
		playerTwo = new Player("Player","Two");
	}
	
	@Test
	public void verifySetUp(){
		assertTrue(playerOne.getName().equalsIgnoreCase("one"));
		assertTrue(playerTwo.getName().equalsIgnoreCase("player"));
		assertTrue(playerTwo.getSurname().equalsIgnoreCase("two"));
	}
	
	@Test
	public void createdPlayerShouldHaveNoMoney() {
		assertTrue(playerOne.getBankAmount()==0);
		assertTrue(playerTwo.getBankAmount()==0);		
	}
	
	@Test
	public void setBankAmount() {
		playerOne.setBankAmount(5000);
		assertTrue(playerOne.getBankAmount()==5000);
	}
	
	@Test
	public void changeBankAmount()
	{
		playerOne.changeBalance(500);
		assertTrue(playerOne.getBankAmount()==500);
		playerOne.changeBalance(-250);
		assertTrue(playerOne.getBankAmount()==250);		
	}
	
	@Test
	public void resetPlayer() 
	{
		assertTrue(playerTwo.getBankAmount()==0);
		playerTwo.changeBalance(1000);
		assertTrue(playerTwo.getBankAmount()==1000);
		playerTwo.resetBalance();
		assertTrue(playerTwo.getBankAmount()==0);		
	}
	
	@Test
	public void compareToTest()	
	{
		assertFalse(playerOne.equals(playerTwo));
	}
	
	@Test
	public void toStringTest() 
	{
		assertTrue(playerOne.toString().contains("One"));
	}
	

}
