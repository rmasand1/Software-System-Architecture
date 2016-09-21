/*
 StorreData for Account 1
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class StoreData1 extends StoreData
{
    public void StoreData(DataStore ds)
    {
        /*store and return values for Pin, User Id and Balance*/
        ((DataStore1)ds).setPin();
	System.out.println("Account 1:The set PIN is " + ((DataStore1)ds).getPin() );
        ((DataStore1)ds).setUid();
	System.out.println("Account 1:The set User ID is " + ((DataStore1)ds).getUid() );
        ((DataStore1)ds).setBalance();
	System.out.println("Account 1:The Balance is " + ((DataStore1)ds).getBalance() );
    }
}
