package Fields;

public class StationField extends Field{

	private int price;
	
	public StationField(String name, int number, int price)  throws IllegalArgumentException {
		super(name, number);
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
		 
	
		
	

}
