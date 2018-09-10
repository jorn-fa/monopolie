
import java.util.TreeMap;


import Fields.*;



public class Board {

	
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
	
}
