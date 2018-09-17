import Fields.*;
import Parts.Player;

public class Monopolie {

	
	
	
	public static void main(String[] args) {
		
		Player player = new Player("ikke","niet", 1);
		player.setBankAmount(5000);
		System.out.println(player);
		Board board = new Board();
		
		Field f1 = new Field("Start Veld");
		f1.setFieldNumber(1);
		Field f2 = new StreetField("eerste straat", 15000);
		f2.setFieldNumber(2);
				
		try {
			board.addField(f1);
			board.addField(f2);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println(board.getFieldamount());
		
		
	}

}
