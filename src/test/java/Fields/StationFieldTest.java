package Fields;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Fields.Field;
import Fields.StationField;


public class StationFieldTest {
	
	private Field fieldOne;
	private Field fieldTwo;
	
	
	@Before
	public void setUp() {
		fieldOne = new StationField("name", 15, 15000);
		fieldTwo = new StationField("otherName", 5, 12000);
	}
	
	@Test
	public void verifySetup()
	{
		assertTrue(fieldOne.getName()=="name");
		assertTrue(fieldTwo.getNumber()==5);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void failedCreate() 
	{
		Field test=new StationField(null, 0, 0);
		assertTrue(test.getName()==null);
	}

}