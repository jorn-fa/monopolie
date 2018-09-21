/**
 * 
 */
package Exeptions;



/**
 * @author Jorn
 *
 */
public class NegativeBankAmount extends Exception {

	public NegativeBankAmount() {		
	}
	
	public NegativeBankAmount(String message) {
		super(message);
		}
}
