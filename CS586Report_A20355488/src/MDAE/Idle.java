/*
 To perform operation when the Machine is in Idle State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class Idle implements State
{
    MDAEFSM m=null;
    public Idle(MDAEFSM m)
    {
        this.m =  m;
    }
    public void Open()
    {
        
    }
    public void Login()
    {
        m.attempts = 0;
    	m.op.PromptForPin();
    	m.setState(m.getCheckPinState());
    }
    public void IncorrectLogin()
    {
        m.op.IncorrectIdMsg();
    }
    public void IncorrectPin(int max)
    {

    }
    public void CorrectPinBelowMin()
    {

    }
    public void CorrectPinAboveMin()
    {

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
