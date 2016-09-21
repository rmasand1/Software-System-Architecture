/*
 To perform operation when the Machine is in CheckPin State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class Start implements State
{
    MDAEFSM m=null;
    public Start(MDAEFSM m)
    {
        this.m =  m;
    }
    public void Open()
    {
        m.op.StoreData();
        m.setState(m.getIdleState());
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
