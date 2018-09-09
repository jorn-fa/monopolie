package Parts;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class DiceTest {
	
	private Dice diceOne;
	private Dice diceTwo;
	private int maxNumber;
	
	@Before
	public void setUp() {
		maxNumber=6;
		diceOne=new Dice(maxNumber);
		diceTwo=new Dice(maxNumber);
	}
	
	@Test
	public void verifySetUp()
	{
		assertTrue(diceOne.toString()!=null);
		assertTrue(diceTwo.toString()!=null);
	}
	
	
	@Test	
	public void checkRollsNotAboveMaxNumber() {
		int counter=0;
		for (int i=0;i<100000;i++) {
			if(diceOne.getThrow()>maxNumber) {i++;}
			if(diceTwo.getThrow()>maxNumber) {i++;}			
		}
		assertTrue(counter==0);
	}
}
