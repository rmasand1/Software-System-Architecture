/*
 The output processor class for the actions
 */
package Output;
import Data_Store.*;
import Abstract_Factory.*;
import Strategy.*;
/**
 *
 * @author Roshni
 */
public class OP
{
    AbstractFactory af =null;
    DataStore ds = null;
    public OP(AbstractFactory af,DataStore ds)
    {
        this.af = af;
        this.ds = ds;
    }
    public void StoreData()
    {
	System.out.println("Action StoreData");
	StoreData store_d = af.CreateStoreData();
	store_d.StoreData(ds);
    }
    public void IncorrectIdMsg()
    {
	System.out.println("Action IncorrectIdMsg");
	IncorrectIdMsg id_msg = af.CreateIncorrectIdMsg();
	id_msg.IncorrectIdMsg();
    }
    public void IncorrectPinMsg()
    {
	System.out.println("Action IncorrectPinMsg");
	IncorrectPinMsg pin_msg = af.CreateIncorrectPinMsg();
	pin_msg.IncorrectPinMsg();
    }
    public void TooManyAttemptsMsg()
    {
	System.out.println("Action TooManyAttemptsMsg");
	TooManyAttemptsMsg too_many_attempts = af.CreateTooManyAttemptsMsg();
	too_many_attempts.TooManyAttemptsMsg();
    }
    public void DisplayMenu()
    {
	System.out.println("Action DisplayMenu");
	DisplayMenu disp_menu = af.CreateDisplayMenu();
	disp_menu.DisplayMenu();
    }
    public void MakeDeposit()
    {
	System.out.println("Action MakeDeposit ");
	MakeDeposit make_deposit = af.CreateMakeDeposit();
	make_deposit.MakeDeposit(ds);
    }
    public void DisplayBalance()
    {
	System.out.println("Action DisplayBalance ");
	DisplayBalance disp_bal = af.CreateDisplayBalance();
	disp_bal.DisplayBalance(ds);
    }
    public void PromptForPin()
    {
	System.out.println("Action PromptForPin ");
	PromptForPin prompt_pin = af.CreatePromptForPin();
	prompt_pin.PromptForPin();
    }
    public void MakeWithdraw()
    {
        System.out.println("Action MakeWithdraw  ");
	MakeWithdraw make_withdraw = af.CreateMakeWithdraw();
	make_withdraw.MakeWithdraw(ds);
    }
    public void Penalty()
    {
	System.out.println("Action Penalty  ");
	Penalty penalty = af.CreatePenalty();
	penalty.Penalty(ds);
    }
    public void IncorrectLockMsg()
    {
        System.out.println("Action IncorrectLockMsg");
	IncorrectLockMsg lock_msg = af.CreateIncorrectLockMsg();
	lock_msg.IncorrectLockMsg();
    }
    public void IncorrectUnlockMsg()
    {
	System.out.println("Action IncorrectUnlockMsg");
	IncorrectUnlockMsg unlcok_msg = af.CreateIncorrectUnlockMsg();
	unlcok_msg.IncorrectUnlockMsg();
    }
    public void NoFundsMsg()
    {
	System.out.println("Action NoFundsMsg");
	NoFundsMsg no_funds = af.CreateNoFundsMsg();
	no_funds.NoFundsMsg();
    }
}
