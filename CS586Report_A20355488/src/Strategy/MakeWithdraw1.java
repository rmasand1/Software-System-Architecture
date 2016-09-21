/*
 MakeWithdraw for Account 1
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class MakeWithdraw1 extends MakeWithdraw
{
    public void MakeWithdraw(DataStore ds)
    {
        /*sets the withdraw amount in the datastore for Account1, and calculates and returns the final balance after withdraw*/
        ((DataStore1)ds).setWithdraw();
	((DataStore1)ds).computeBalanceAfterWithdraw();
        System.out.println("Account 1: After Withdraw, Balance is " + ((DataStore1)ds).getBalance() );
    }
}
