import java.util.List;

import javax.naming.InitialContext;

import Fields.*;



public class Board {

	private List<Field> squares;
	
	
	public Board() {
		super();
		
	}


	public int getFieldamount() {
		return squares.size();
	}
	
	public boolean addField(Field field) {
		return squares.add(field);
	}
	
}
