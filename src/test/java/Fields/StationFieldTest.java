package Fields;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Fields.Field;
import Fields.StationField;


public class StationFieldTest {
	
	private StationField fieldOne;
	private StationField fieldTwo;
	
	
	@Before
	public void setUp() {
		fieldOne = new StationField("name",  15000);
		fieldTwo = new StationField("otherName", 12000);
	}
	
	@Test
	public void verifySetup()
	{
		assertTrue(fieldOne.getName()=="name");		
		assertTrue(fieldTwo.getPrice()==12000);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void failedCreate() 
	{
		StationField test=new StationField(null,  0);	
		assertTrue(test.getName()==null);
		
	}
	
	@Test
	public void priceTest() {
		assertTrue(fieldOne.getPrice()==15000);
	}

}
