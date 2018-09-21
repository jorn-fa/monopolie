package Fields;

import java.io.Serializable;
import java.util.Comparator;

import Parts.Player;

public abstract class  Field implements Serializable,Comparable<Field>{

	
	//default number used
	private static final long serialVersionUID = 1L;
	private String name;	
	private Player player;
	
	private int fieldNumber;
	
	private int groupNumber;

	public Field(String name) throws IllegalArgumentException {
		super();
		if (name==null)  throw new IllegalArgumentException("Check Input");		
		this.name = name;
	}

	public void setPlayer(Player player) {
		this.player=player;	
	}
	
	public Player getPlayer() {
		return player;
	}

	public String getName() {
		return name;
	}		

	public int getGroupNumber() {
		return groupNumber;
	}
	

	public int getFieldNumber() {
		return fieldNumber;
	}
	
	public abstract int getPrice();

	public void setFieldNumber(int fieldNumber) {
		this.fieldNumber = fieldNumber;
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
