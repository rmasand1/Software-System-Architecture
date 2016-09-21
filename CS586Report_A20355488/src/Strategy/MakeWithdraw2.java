/*
 MakeWithdraw for Account 2
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class MakeWithdraw2 extends MakeWithdraw
{
     public void MakeWithdraw(DataStore ds)
     {
         /*sets the withdraw amount in the datastore for Account2, and calculates and returns the final balance after withdraw*/
        ((DataStore2)ds).setWithdraw();
	((DataStore2)ds).computeBalanceAfterWithdraw();
        System.out.println("Account 2: After Withdraw, Balance is " + ((DataStore2)ds).getBalance() );
     }
}
