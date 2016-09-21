/*
 StoreData for Account 2
 */
package Strategy;
import Data_Store.*;
/**
 *
 * @author Roshni
 */
public class StoreData2 extends StoreData
{
    public void StoreData(DataStore ds)
    {
        /*store and return values for Pin, User Id and Balance*/
        ((DataStore2)ds).setPin();
	System.out.println("Account 2:The set PIN is " + ((DataStore2)ds).getPin() );
        ((DataStore2)ds).setUid();
	System.out.println("Account 2:The set User ID is " + ((DataStore2)ds).getUid() );
        ((DataStore2)ds).setBalance();
	System.out.println("Account 2:The Balance is " + ((DataStore2)ds).getBalance() );
    }
}
