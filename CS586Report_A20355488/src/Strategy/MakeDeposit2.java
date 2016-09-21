/*
MakeDeposit for Account 2
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class MakeDeposit2 extends MakeDeposit
{
    public void MakeDeposit(DataStore ds)
    {
        /*sets the deposit amount in the datastore for Account2, and calculates and returns the final balance after deposit*/
        ((DataStore2)ds).setDeposit();
	((DataStore2)ds).computeBalanceAfterDeposit();
	System.out.println("Account 2: After Deposit, Balance is " + ((DataStore2)ds).getBalance() );
    }
}
