package Fields;

import java.io.Serializable;

public class TaxField extends Field implements Serializable{

	//default number used
	private static final long serialVersionUID = 1L;
	
	private final int amount;
	
	public TaxField(String name, int number, int taxAmount) throws IllegalArgumentException {
		super(name, number);
		this.amount=taxAmount;
		
	}

	public int getAmount() {
		return amount;
	}
	
	

	
}
