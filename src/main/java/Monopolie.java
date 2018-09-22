import java.rmi.server.RMIFailureHandler;
import java.util.Optional;

import Exeptions.NegativeBankAmount;
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
	
	
	public boolean buyField(Player player)  {		
	
		int playerCash=player.getBankAmount();
		int fieldPrice=getCurrentField().getPrice();
		
		if((playerCash-fieldPrice<0)){return false;}		
		
		player.setBankAmount(playerCash-fieldPrice);
		getCurrentField().setPlayer(player);
		
		return true;
	}
	
	public void sellField(Player player) {
		int playerCash=player.getBankAmount();
		int fieldPrice=getCurrentField().getPrice();
		
		player.setBankAmount(playerCash+(fieldPrice/2));
		getCurrentField().setPlayer(null);	
		
		
	}
	
	public void checkFieldType(Player player) {
		
		if(getCurrentField()  instanceof TaxField) {
			System.out.println("ye");
			System.out.println(getCurrentField().getPrice());
			player.changeBalance(-getCurrentField().getPrice());
			
		}
	}
	
	
	public boolean hasOwner() {
		if (board.getOwnerNumberFromField(fieldPosition)!=null) { return true;}
		return false;
	}	
	
	public Player getOwner() {

		Optional<Player> optional = Optional.ofNullable(board.getOwnerNumberFromField(fieldPosition));
		return optional.orElse(new Player("None",-1));
	}
	
	
	public void displayFieldName() {
		System.out.println(getCurrentField().getName());
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Monopolie monopolie=new Monopolie();
		
		Player player = new Player("ikke","niet", 1);
		player.setBankAmount(50000);
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
		Field f7 = new TaxField("Tax een", 1500);
		f7.setFieldNumber(7);
				
		try {
			monopolie.board.addField(f1);
			monopolie.board.addField(f2);
			monopolie.board.addField(f3);
			monopolie.board.addField(f4);
			monopolie.board.addField(f5);
			monopolie.board.addField(f6);	
			monopolie.board.addField(f7);
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		monopolie.rollDice();
		monopolie.displayFieldName();
		monopolie.rollDice();
		monopolie.displayFieldName();		
		monopolie.rollDice();
		monopolie.buyField(player);
		System.out.println(player.getBankAmount());
		
		monopolie.displayFieldName();
		//monopolie.sellField(player);
		System.out.println(player.getBankAmount());

		for(int i = 0; i<10;i++) {
		monopolie.rollDice();
		monopolie.checkFieldType(player);
		System.out.print("veld: + "); 
		monopolie.displayFieldName();
		System.out.println(monopolie.getOwner().getName());}	
		
		System.out.println(player.getBankAmount());
		
	}

}
