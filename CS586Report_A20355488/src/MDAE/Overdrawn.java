/*
 To perform operation when the Machine is in Overdrawn State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class Overdrawn implements State
{
    MDAEFSM m=null;
    public Overdrawn(MDAEFSM m)
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
        m.op.MakeDeposit();
        m.setState(m.getS1State());
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
        m.op.DisplayBalance();
    }
    public void Withdraw()
    {
        m.op.NoFundsMsg();
    }
    public void WithdrawBelowMinBalance()
    {
        
    }
    public void NoFunds()
    {

    }
    public void Lock()
    {
        m.setState(m.getLockedState());
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
