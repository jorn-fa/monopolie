
import java.util.TreeMap;


import Fields.*;
import Parts.Player;



public class Board {

	//define Field
	private TreeMap<Integer, Field> squares;
	
	
	
	public Board() {
		super();
		
	}


	public int getFieldamount() {
		return squares.size();
	}
	
	public boolean addField(Field field) {		
		return squares.put(field.getNumber(),field) != null;
	}
	
	public void addOwnerToField(Player player, int fieldNumber) 
	{
		squares.get(fieldNumber).setPlayerNumber(player.getNumber());
				
	}
	
	public int getOwnerNumberFromField(int fieldNumber) {
		return squares.get(fieldNumber).getNumber();
	}
	
}
