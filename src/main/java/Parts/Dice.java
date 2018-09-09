package Parts;

public class Dice {

	private final int maxNumber;

	public Dice(int maxNumber) {
		super();
		this.maxNumber = maxNumber;
	}
	
	
	private int getThrow()
	{		
		//+1 geeft max nummer ook terug als getal anders is het max 0.99 rounded down
		return (int)(Math.random()*maxNumber+1);
	}
	
}
