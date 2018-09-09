package Fields;

import javax.naming.InitialContext;

public class StreetField extends Field{

	private int price;
	private int house;
	private int hotel;	
	
	private final int maxHouse=4;
	private final int maxHotel=1;
	
	
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
	
	public int getHotel() {
		return hotel;
	}	

	public int getHouse() {
		return house;
	}

	public void addHouse(int amount) {
		if(house<maxHouse) {house+=amount;}
	}
	
	public void addHotel() {
		if (house==maxHouse) 
		{
			house=0;
			hotel+=1;
		}
		
	}
	
	public void resetStreetfield() {
		init();
	}
	
}
