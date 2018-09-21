package Fields;

import java.io.Serializable;

public class PrisonField extends Field implements Serializable{
	
	
		
	
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static final long serialVersionUID = 1L;
	private boolean visiting;
	
	public PrisonField(String name ) throws IllegalArgumentException {
		super(name);
		
	}
	
	public boolean isVisiting() {
		return visiting;
	}

	
	
	

}
