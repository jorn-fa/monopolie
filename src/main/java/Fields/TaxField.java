package Fields;

import java.io.Serializable;

public class TaxField extends Field implements Serializable{

	//default number used
	private static final long serialVersionUID = 1L;
	
	private final int amount;
	
	public TaxField(String name,  int taxAmount) throws IllegalArgumentException {
		super(name);
		this.amount=taxAmount;
		
	}

	

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return amount;
	}
	
	
	

	
}
