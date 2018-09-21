
import java.util.Optional;
import java.util.TreeMap;


import Fields.*;
import Parts.Player;



public class Board {

	//define Field
	private TreeMap<Integer, Field> squares = new TreeMap<Integer,Field>();
	
	
	
	public Board() {
		super();
		
	}


	public int getFieldamount() {
		return squares.size();
	}
	
	public boolean addField(Field field)  throws NoSuchFieldException{
		// is thrown when a class does not contain the field (or variable) specified
		
		if(field.getFieldNumber()==0) {throw new NoSuchFieldException ("No number defined on field");}
		
		return squares.put(field.getFieldNumber(),field) != null;
		
	}
	
	public void addOwnerToField(Player player, int fieldNumber) 
	{
		squares.get(fieldNumber).setPlayer(player);
				
	}
	
	public Player getOwnerNumberFromField(int fieldNumber) {
		//if(squares.get(fieldNumber).getPlayer()==null) {return null; }
		
		return squares.get(fieldNumber).getPlayer();
	}
	
	public Field getFieldFromNumber(int fieldNumber) {
		return squares.get(fieldNumber);
	}
	
	public int getFieldPrice(int fieldNumber) {
		
		return getFieldFromNumber(fieldNumber).getPrice();
		
	}
		

		
	
}
