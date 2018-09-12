package Fields;

import java.io.Serializable;

public class StationField extends Field implements Serializable{

	
	//default number used
	private static final long serialVersionUID = 1L;
	private int price;
	
	public StationField(String name,  int price)  throws IllegalArgumentException {
		super(name);
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
		 
	
		
	

}
