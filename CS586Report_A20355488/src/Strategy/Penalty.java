/*
 Computes and displays the penalty for account 1
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class Penalty
{
    public void Penalty(DataStore ds)
    {
        ((DataStore1)ds).setPenalty();
	System.out.println("Account 1: Minimum required balance is $500. So Penalty is applied.");
	System.out.println("After a Penalty of $20, Balance is " + ((DataStore1)ds).balance );
    }
}
