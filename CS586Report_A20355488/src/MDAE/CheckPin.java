/*
 To perform operation when the Machine is in CheckPin State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class CheckPin implements State
{
    MDAEFSM m=null;
    public CheckPin(MDAEFSM m)
    {
        this.m =  m;
    }
    public void Open()
    {

    }
    public void Login()
    {

    }
    public void IncorrectLogin()
    {

    }
    public void IncorrectPin(int max)
    {
        //check conditions provided in the EFSM
        if( m.attempts < max )
    	{
    		m.attempts++;
    		m.op.IncorrectPinMsg();
    	}
    	else if( m.attempts == max )
    	{
    		m.op.IncorrectPinMsg();
    		m.op.TooManyAttemptsMsg();
    		m.setState(m.getIdleState());//change the state and set it
    	}
    }
    public void CorrectPinBelowMin()
    {
        m.op.DisplayMenu();
    	m.setState(m.getOverdrawnState());
    }
    public void CorrectPinAboveMin()
    {
        m.op.DisplayMenu();
    	m.setState(m.getReadyState());
    }
    public void Deposit()
    {

    }
    public void BelowMinBalance()
    {

    }
    public void AboveMinBalance()
    {

    }
    public void Logout()
    {
        m.setState(m.getIdleState());
    }
    public void Balance()
    {

    }
    public void Withdraw()
    {

    }
    public void WithdrawBelowMinBalance()
    {

    }
    public void NoFunds()
    {

    }
    public void Lock()
    {

    }
    public void IncorrectLock()
    {

    }
    public void Unlock()
    {

    }
    public void IncorrectUnlock()
    {

    }
    public void Suspend()
    {

    }
    public void Activate()
    {

    }
    public void Close()
    {

    }
}
