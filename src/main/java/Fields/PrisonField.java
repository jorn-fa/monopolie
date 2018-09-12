package Fields;

import java.io.Serializable;

public class PrisonField extends Field implements Serializable{
	
	
		
	
	private static final long serialVersionUID = 1L;
	private boolean visiting;
	
	public PrisonField(String name ) throws IllegalArgumentException {
		super(name);
		
	}
	
	public boolean isVisiting() {
		return visiting;
	}

	
	
	

}
