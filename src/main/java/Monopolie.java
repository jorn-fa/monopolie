import Fields.*;
import Parts.Player;

public class Monopolie {

	
	
	
	public static void main(String[] args) {
		
		Player player = new Player("ikk","enit", 1);
		player.setBankAmount(5000);
		System.out.println(player);
		Board board = new Board();
		
		Field f1 = new Field("Start Veld");
		Field f2 = new StreetField("eerste straat", 15000);
		
		board.addField(f1);
		board.addField(f2);
		
		
		board.addOwnerToField(player, 1);
		
		
	}

}
