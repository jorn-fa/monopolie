package Fields;

public class TaxField extends Field{

	private final int amount;
	
	public TaxField(String name, int number, int taxAmount) throws IllegalArgumentException {
		super(name, number);
		this.amount=taxAmount;
		
	}

	public int getAmount() {
		return amount;
	}
	
	

	
}
