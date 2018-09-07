package Fields;

import java.io.Serializable;

public class Field {

	
	private String name;
	private int number;

	public Field(String name, int number) throws IllegalArgumentException{
		super();
		if (name==null)  throw new IllegalArgumentException("Check Input");
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}	

	public int getNumber() {
		return number;
	}	
	
}
