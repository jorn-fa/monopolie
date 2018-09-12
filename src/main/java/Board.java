
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
	
	public boolean addField(Field field) {
		return squares.put(field.getFieldNumber(),field) != null;
	}
	
	public void addOwnerToField(Player player, int fieldNumber) 
	{
		squares.get(fieldNumber).setPlayer(player);
				
	}
	
	public Player getOwnerNumberFromField(int fieldNumber) {
		return squares.get(fieldNumber).getPlayer();
	}
	
}
