/*
 DisplayBalance for Account 1
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class DisplayBalance1 extends DisplayBalance
{
    public void DisplayBalance(DataStore ds)
	{
                /*prints the current balance*/
		System.out.println("Account 1: Balance is " + ((DataStore1)ds).getBalance() );
	}
}
