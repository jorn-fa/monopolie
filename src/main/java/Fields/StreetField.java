package Fields;

import javax.naming.InitialContext;

public class StreetField extends Field{

	private int price;
	private int house;
	private int hotel;
	
	
	public StreetField(String name, int number, int price) throws IllegalArgumentException {
		super(name, number);
		this.price=price;
		init();
	}
	
	private void init() {
		house=0;
		hotel=0;
	}

	public int getPrice() {
		return price;
	}
	
	public void addHouse(int amount) {
		house+=amount;
	}
	
	public void addHotel(int amount) {
		hotel+=amount;
	}
	
	public void resetStreetfield() {
		init();
	}
	
}
