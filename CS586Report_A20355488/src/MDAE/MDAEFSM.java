/*
 MDAEFSM maintains all the events used for performing actions
 */
package MDAE;
import Abstract_Factory.*;
import Output.*;
/**
 *
 * @author Roshni
 */
public class MDAEFSM
{
    /*State Objects*/
    State startState = new Start(this);
    State idleState = new Idle(this);
    State checkpinState = new CheckPin(this);
    State readyState = new Ready(this);
    State lockedState = new Locked(this);
    State overdrawnState = new Overdrawn(this);
    State suspenedState = new Suspended(this);
    State s1State = new S1(this);
    State efsmState = null;
    public int attempts;
    AbstractFactory af =null;
    OP op = null;

    public MDAEFSM(AbstractFactory af,OP op)
    {
        efsmState = startState;
        attempts = 0;
        this.af = af;
        this.op = op;
    }
    public void Open()
    {
        efsmState.Open();
        printCurrentState();
    }
    public void Login()
    {
    	efsmState.Login();
    	attempts = 0;
    	printCurrentState();
    }
    public void IncorrectLogin()
    {
    	efsmState.IncorrectLogin();
    	printCurrentState();
    }
    public void IncorrectPin(int max)
    {
    	efsmState.IncorrectPin(max);
    	printCurrentState();
    }
    public void CorrectPinBelowMin()
    {
    	efsmState.CorrectPinBelowMin();
    	printCurrentState();
    }
    public void CorrectPinAboveMin()
    {
    	efsmState.CorrectPinAboveMin();
    	printCurrentState();
    }
    public void Deposit()
    {
    	efsmState.Deposit();
    	printCurrentState();
    }
    public void BelowMinBalance()
    {
    	efsmState.BelowMinBalance();
    	printCurrentState();
    }
    public void AboveMinBalance()
    {
    	efsmState.AboveMinBalance();
    	printCurrentState();
    }
    public void Logout()
    {
    	efsmState.Logout();
    	printCurrentState();
    }
    public void Balance()
    {
    	efsmState.Balance();
    	printCurrentState();
    }
    public void Withdraw()
    {
    	efsmState.Withdraw();
    	printCurrentState();
    }
    public void WithdrawBelowMinBalance()
    {
    	efsmState.WithdrawBelowMinBalance();
    	printCurrentState();
    }
    public void NoFunds()
    {
        efsmState.NoFunds();
    	printCurrentState();
    }
    public void Lock()
    {
    	efsmState.Lock();
    	printCurrentState();
    }
    public void IncorrectLock()
    {
    	efsmState.IncorrectLock();
    	printCurrentState();
    }
    public void Unlock()
    {
    	efsmState.Unlock();
    	printCurrentState();
    }
    public void IncorrectUnlock()
    {
    	efsmState.IncorrectUnlock();
    	printCurrentState();
    }
    public void Suspend()
    {
    	efsmState.Suspend();
    	printCurrentState();
    }
    public void Activate()
    {
    	efsmState.Activate();
    	printCurrentState();
    }
    public void Close()
    {
    	efsmState.Close();
        printCurrentState();
    }
    /*set the current state*/
    public void setState(State efsmState)
    {
        this.efsmState = efsmState;
    }
    public State getStartState()
    {
        return startState;
    }
    public State getIdleState()
    {
        return idleState;
    }
    public State getCheckPinState()
    {
        return checkpinState;
    }
    public State getReadyState()
    {
        return readyState;
    }
    public State getS1State()
    {
        return s1State;
    }
    public State getLockedState()
    {
        return lockedState;
    }
    public State getOverdrawnState()
    {
        return overdrawnState;
    }
    public State getSuspendedState()
    {
        return suspenedState;
    }
    public void printCurrentState()
    {
    	System.out.println("Current State : "+ efsmState.getClass().getName());
    }
}
