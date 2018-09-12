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
	
	private int houseCost;
	private int hotelCost;
	
	
	
	public StreetField(String name, int price) throws IllegalArgumentException {
		super(name);
		this.price=price;
		init();
	}
	
	private void init() {		
		houseCost=0;
		hotelCost=0;
		houses=new ArrayList<House>();
		hotels=new ArrayList<Hotel>();
		
	}

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
		return houseCost;
	}

		public int getHotelPrice() {
		return hotelCost;
	}	

	public void addHouse(House house) {
		if(houses.size()<maxHouse) {houses.add(house);}
		if(houseCost==0){houseCost = house.getCost();}
	}
	
	public void addHotel(Hotel hotel) {
		if (hotels.size()<maxHotel) {hotels.add(hotel);}
		if(hotelCost==0) {hotelCost=hotel.getCost();}		
	}
	
	public void resetStreetfield() {
		init();
	}
	
	public double getMorgage()
	{
		return price/2;
	}
}
