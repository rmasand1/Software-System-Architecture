/*
 To perform operation when the Machine is in Suspended State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class Suspended implements State
{
    MDAEFSM m=null;
    public Suspended(MDAEFSM m)
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
        m.op.DisplayBalance();
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
        m.setState(m.getReadyState());
    }
    public void Close()
    {
        System.out.println("Account Closed");
        System.exit(0);

    }
}
