package Parts;
import java.io.Serializable;
import java.util.Comparator;



public class Player implements Comparable<Player>,Serializable{
	
	
	//default Uid -> change on class completion
	private static final long serialVersionUID = 1L;
	private final String name,surname;	
	private int playerNumber;
	private int bankAmount;
	private boolean isHuman=true;
	
	public Player(String name, int playerNumber) {
		super();
		this.name = name;
		this.surname="";
		this.playerNumber=playerNumber;
		init();
	}
		
	
	public Player(String name, String surname, int playerNumber ) {
		super();
		this.name = name;
		this.surname = surname;
		this.playerNumber=playerNumber;
		init();		
	}
	

	private void init() {
		bankAmount=0;		
	}	

	
	
	public Integer getBankAmount() {
		return bankAmount;
	}


	public void setBankAmount(Integer bankAmount) {
		this.bankAmount = bankAmount;
	}
	
	public void changeBalance(int amount) {
		bankAmount+=amount;
	}
	
	public void resetBalance() {
		init();
	}


	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}
	
	public Boolean isHuman() {
		return isHuman;
	}
	
	public void setAi() {
		isHuman = false;
	}
	
	public void setHuman() {
		isHuman = true;
	}
	

	public int compareTo(Player comparePlayer) {
        return Comparator.comparing(Player::getName)
                .thenComparing(Player::getSurname)
                .compare(this,comparePlayer);
    }
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", surname=" + surname + ", bankAmount=" + bankAmount + "]";
	}


	public int getNumber() {
		return playerNumber;
	}

	
	
	
	

}
