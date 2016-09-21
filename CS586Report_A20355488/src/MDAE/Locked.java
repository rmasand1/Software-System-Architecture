/*
 To perform operation when the Machine is in Locked State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class Locked implements State
{
    MDAEFSM m=null;
    public Locked(MDAEFSM m)
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
        m.setState(m.getS1State());
    }
    public void IncorrectUnlock()
    {
        m.op.IncorrectUnlockMsg();
        //m.setState(m.getLockedState());
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
