/*
 Implementation for Account 2
 */

package Accounts;
import MDAE.MDAEFSM;
import Data_Store.DataStore;
import Data_Store.DataStore2;

/**
 *
 * @author Roshni
 */
public class Account2
{
    /* MDAEFSM object (Pointer to MDAEFSM) */
    MDAEFSM m = null;
    /* Pointer to DataStore */
    DataStore ds = null;
    public Account2(MDAEFSM m,DataStore ds)
    {
        this.m = m;
        this.ds = ds;
    }
    /*implementations for the functions belonging to Account 2*/
    public void OPEN(int p, int y, int a)
    {
    	((DataStore2)ds).temp_p = p;//stores the value for pin
    	((DataStore2)ds).temp_y = y;//stores the value for user id
        ((DataStore2)ds).temp_a = a;//stores the value for balance
        m.Open();
    }
    public void PIN(int x)
    {
    	/*check if the entered pin matches the stored value for pin*/
        if(x == ((DataStore2)ds).temp_p)
            m.CorrectPinAboveMin();
    	else
            m.IncorrectPin(2);
    }
    public void DEPOSIT(int d)
    {
    	((DataStore2)ds).temp_d = d;//store the input in temp_d
    	m.Deposit();
    }
    public void WITHDRAW(int w)
    {
    	((DataStore2)ds).temp_w = w;//store the input in temp_w
    	if(((DataStore2)ds).temp_a > 0)//check if balance>0
    	{
    		m.Withdraw();
                m.AboveMinBalance();
    	}
        else
                m.NoFunds();
    }
    public void BALANCE()
    {
    	m.Balance();
    }
    public void LOGIN(int y)
    {
         /*call Login() only if the entered pin and stored pin match*/
        if(y==((DataStore2)ds).temp_y)
            m.Login();
        else
            m.IncorrectLogin();
    }
    public void LOGOUT()
    {
        m.Logout();
    }
    public void suspend()
    {
        m.Suspend();
    }
    public void activate()
    {
        m.Activate();
    }
    public void close()
    {
        m.Close();
    }
}
