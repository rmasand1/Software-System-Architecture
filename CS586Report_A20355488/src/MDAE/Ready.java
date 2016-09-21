/*
 To perform operation when the Machine is in Ready State
 */
package MDAE;
/**
 *
 * @author Roshni
 */
public class Ready implements State
{
    MDAEFSM m=null;
    public Ready(MDAEFSM m)
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
        m.op.MakeWithdraw();
        m.setState(m.getS1State());
    }
    public void WithdrawBelowMinBalance()
    {

    }
    public void NoFunds()
    {
        m.op.NoFundsMsg();
    }
    public void Lock()
    {
        m.setState(m.getLockedState());
    }
    public void IncorrectLock()
    {
        m.op.IncorrectLockMsg();
    }
    public void Unlock()
    {

    }
    public void IncorrectUnlock()
    {

    }
    public void Suspend()
    {
        m.setState(m.getSuspendedState());
    }
    public void Activate()
    {

    }
    public void Close()
    {

    }
}
