/*
 DisplayBalance for Account 2
 */

package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class DisplayBalance2 extends DisplayBalance
{
    public void DisplayBalance(DataStore ds)
	{
                /*prints the current balance*/
		System.out.println("Account 2: Balance is " + ((DataStore2)ds).getBalance() );
	}
}
