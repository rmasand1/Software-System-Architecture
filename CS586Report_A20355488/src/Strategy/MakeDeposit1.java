/*
 MakeDeposit action for Account 1
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class MakeDeposit1 extends MakeDeposit
{
    public void MakeDeposit(DataStore ds)
    {
        /*sets the deposit amount in the datastore for Account1, and calculates and returns the final balance after deposit*/
        ((DataStore1)ds).setDeposit();
	((DataStore1)ds).computeBalanceAfterDeposit();
	System.out.println("Account 1: After Deposit, Balance is " + ((DataStore1)ds).getBalance() );
    }
}
