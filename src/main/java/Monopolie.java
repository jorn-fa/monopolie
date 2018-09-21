import java.rmi.server.RMIFailureHandler;
import java.util.Optional;

import Fields.*;
import Parts.*;

public class Monopolie {
	
	//todo inlezen via config
	int diceSize=6;
	public Board board = new Board();
	
	int fieldPosition = 1;
	
	public void rollDice()
	{
		fieldPosition+=new Dice(diceSize).getThrow();	
			
		if(fieldPosition>board.getFieldamount()) {
			//correction to reset to start
			fieldPosition  = Math.abs(board.getFieldamount()-fieldPosition);			
		}
	
	}
	
	private Field getCurrentField() {return board.getFieldFromNumber(fieldPosition); }
	
	
	public void buyField(Player player) {		
	player.setBankAmount(player.getBankAmount()-getCurrentField().getPrice());
	getCurrentField().setPlayer(player);		
	}
	
	public void sellField(Player player) {
		player.setBankAmount(player.getBankAmount()+(getCurrentField().getPrice()/2));
	}
	
	
	public boolean hasOwner() {
		if (board.getOwnerNumberFromField(fieldPosition)!=null) { return true;}
		return false;
	}	
	
	public Player getOwner() {
		Optional<Player> optional = Optional.of(board.getOwnerNumberFromField(fieldPosition));
		return optional.orElse(new Player("Not Found",-1));
		}
	
	
	public void displayFieldName() {
		System.out.println(getCurrentField().getName());
	}
	
	
	public static void main(String[] args) {
		
		Monopolie monopolie=new Monopolie();
		
		Player player = new Player("ikke","niet", 1);
		player.setBankAmount(5000);
		System.out.println(player);
		
		
		
		
		Field f1 = new StartField("Start Veld");
		f1.setFieldNumber(1);
		Field f2 = new StreetField("eerste straat", 15000);
		f2.setFieldNumber(2);
		Field f3 = new StreetField("tweede straat", 15000);
		f3.setFieldNumber(3);
		Field f4 = new StreetField("derde straat", 15000);
		f4.setFieldNumber(4);
		Field f5 = new StreetField("vierde straat", 15000);
		f5.setFieldNumber(5);
		Field f6 = new StreetField("vijfde straat", 15000);
		f6.setFieldNumber(6);
				
		try {
			monopolie.board.addField(f1);
			monopolie.board.addField(f2);
			monopolie.board.addField(f3);
			monopolie.board.addField(f4);
			monopolie.board.addField(f5);
			monopolie.board.addField(f6);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		monopolie.rollDice();
		monopolie.displayFieldName();
		monopolie.rollDice();
		monopolie.displayFieldName();		
		monopolie.rollDice();		
		monopolie.displayFieldName();
		
	}

}
