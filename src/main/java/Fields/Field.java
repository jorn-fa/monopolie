package Fields;

import java.io.Serializable;

public class Field implements Serializable{

	
	private String name;
	private int number;
	
	private int groupNumber;

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

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int number) throws IllegalArgumentException{
		if (number<=0) { throw new IllegalArgumentException("Wrong groupnumber");}
		this.groupNumber = number;
	}	
	
	
	
}
