/*
 Implementation for Account 1
 */
package Accounts;
import MDAE.MDAEFSM;
import Data_Store.DataStore;
import Data_Store.DataStore1;
/**
 *
 * @author Roshni
 */
public class Account1
{
        
        /* MDAEFSM object (Pointer to MDAEFSM) */
	MDAEFSM m = null;
	/* DataStore object (Pointer to DataStore) */
	DataStore ds = null;

	public Account1(MDAEFSM m,DataStore ds)
	{
        this.m = m;
        this.ds = ds;
        }
        /*implementations for the functions belonging to Account 1*/
	public void open(String p, String y, float a)
	{
               ((DataStore1)ds).temp_p = p; //stores the value for pin
               ((DataStore1)ds).temp_y = y; //stores the value for user id
               ((DataStore1)ds).temp_a = a; //stores the value for balance
		m.Open();
        }
        public void pin( String x )
        {
            /*check if the entered pin matches the stored value for pin*/
            if( x.equals(((DataStore1)ds).temp_p ) )
            {
                /*check if the stored balance is greater than 500 and call either of the 2 methods*/
    		if( ((DataStore1)ds).temp_a > 500 )
    			m.CorrectPinAboveMin();
    		else
    			m.CorrectPinBelowMin();
            }
            else
                m.IncorrectPin(3);
        }
        public void deposit(float d)
        {
            ((DataStore1)ds).temp_d = d;//store the input in temp_d
            m.Deposit();
            /*check the condition and call either operation*/
            if( ((DataStore1)ds).temp_a > 500 )
    		m.AboveMinBalance();
            else
    		m.BelowMinBalance();
        }
        public void withdraw(float w)
        {
            ((DataStore1)ds).temp_w = w;//store the input in temp_d
            m.Withdraw();
            /*check the condition and call either operation*/
            if( ((DataStore1)ds).temp_a > 500 )
    		m.AboveMinBalance();
            else
    		m.WithdrawBelowMinBalance();
        }
        public void balance()
        {
            m.Balance();
        }
        public void login(String y)
        {
            /*call Login() only if the entered pin and stored pin match*/
            if(y.equals(((DataStore1)ds).temp_y))
                m.Login();
            else
                m.IncorrectLogin();
        }
        public void logout()
        {
            m.Logout();
        }
        public void lock(String x)
        {
            /*calls Lock() only if the enter pin matches x*/
            if(x.equals(((DataStore1)ds).temp_p))
                m.Lock();
            else
                m.IncorrectLock();
        }
        public void unlock(String x)
        {
            /*calls Unlock() only if the enter pin matches x*/
            if(x.equals(((DataStore1)ds).temp_p))
            {
    		m.Unlock();
    		if(((DataStore1)ds).balance > 500)
    			m.AboveMinBalance();
    		else
    			m.BelowMinBalance();
            }
            else
    		m.IncorrectUnlock();
        }
}



