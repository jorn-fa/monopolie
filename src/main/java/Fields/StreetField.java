package Fields;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;


import Parts.Hotel;
import Parts.House;

public class StreetField extends Field implements Serializable{

	//default number used
	private static final long serialVersionUID = 1L;
	
	private int price;	
	
	private final int maxHouse=4;
	private final int maxHotel=1;	
	
	private List<House> houses;
	private List<Hotel> hotels;
	
	private int houseCostPrice=0;
	private int hotelCostPrice=0;
	
	
	
	public StreetField(String name, int price) throws IllegalArgumentException {
		super(name);
		this.price=price;
		init();
	}
	
	public StreetField(String name, int fieldPrice, int houseCost, int hotelCost ) throws IllegalArgumentException {
		super(name);
		this.price=price;
		init();
		houseCostPrice=houseCost;
		hotelCostPrice=hotelCost;
	}
	
	private void init() {
		
		houses=new ArrayList<House>();
		hotels=new ArrayList<Hotel>();
		
	}

	@Override
	public int getPrice() {
		return price;
	}	
	
	
	public boolean hasHotel() {
		if(hotels.size()==1) {return true;}
		return false;
	}	

	
	public int getHouse() {
		return houses.size();
	}	

	public int getHouseCost() {
		return houseCostPrice;
	}

		public int getHotelPrice() {
		return hotelCostPrice;
	}	

	public void addHouse() {
		if(houses.size()<maxHouse) {houses.add(new House(houseCostPrice));}		
	}
	
	public void addHotel() {
		if (hotels.size()<maxHotel && houses.size()==maxHouse) {
			hotels.add(new Hotel(hotelCostPrice));
			}		
	}
	
	public void resetStreetfield() {
		init();
	}	
	
}
