package Fields;

import java.io.Serializable;
import java.util.Comparator;

public class Field implements Serializable,Comparable<Field>{

	
	//default number used
	private static final long serialVersionUID = 1L;
	private String name;
	private int playerNumber;
	
	private int groupNumber;

	public Field(String name) throws IllegalArgumentException {
		super();
		if (name==null)  throw new IllegalArgumentException("Check Input");		
		this.name = name;
	}

	public void setPlayerNumber(int number) {
		this.playerNumber=number;	
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}

	public String getName() {
		return name;
	}	

	public int getNumber() {
		return playerNumber;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int number) throws IllegalArgumentException{
		if (number<=0) { throw new IllegalArgumentException("Wrong groupnumber");}
		this.groupNumber = number;
	}

	@Override
	public int compareTo(Field field) {		
        return Comparator.comparing(Field::getGroupNumber)                
                .compare(this,field);
    }
	
	
	
	
}
