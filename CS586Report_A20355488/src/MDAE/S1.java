/*
 To perform operation when the Machine is in S1 State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class S1 implements State
{
    MDAEFSM m=null;
    public S1(MDAEFSM m)
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
        m.setState(m.getOverdrawnState());
    }
    public void AboveMinBalance()
    {
        m.setState(m.getReadyState());
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
        m.op.Penalty();
        m.setState(m.getOverdrawnState());
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
