/*
 Concrete Factory class for Account 2
 */
package Abstract_Factory;
import Data_Store.DataStore;
import Data_Store.DataStore2;
import Strategy.*;

/**
 *
 * @author Roshni
 */
public class ConcreteFactory2 implements AbstractFactory
{
        
        /*creating objects for all actions*/
        DataStore ds = new DataStore2();
        StoreData store=new StoreData2();
        DisplayBalance disp_bal = new DisplayBalance2();
	DisplayMenu disp_menu = new DisplayMenu2();
        IncorrectIdMsg id_msg=new IncorrectIdMsg();
        IncorrectPinMsg pin_msg=new IncorrectPinMsg();
        IncorrectLockMsg lock_msg=new IncorrectLockMsg();
        IncorrectUnlockMsg unlock_msg=new IncorrectUnlockMsg();
        MakeDeposit make_deposit = new MakeDeposit2();
        MakeWithdraw make_withdraw = new MakeWithdraw2();
        NoFundsMsg no_funds=new NoFundsMsg();
	Penalty penalty = new Penalty();
	PromptForPin prompt_pin = new PromptForPin();
	TooManyAttemptsMsg too_many_attempts_msg = new TooManyAttemptsMsg();

        /*returning the creating object for further calls*/
        public void ConcreteFactory2()
	{

	}
        
	public DataStore CreateDataStore()
	{
		return this.ds;
	}
	public DataStore GetDataStore()
	{
		return this.ds;
	}
	public IncorrectPinMsg CreateIncorrectPinMsg()
	{
		return this.pin_msg;
	}
	public TooManyAttemptsMsg CreateTooManyAttemptsMsg()
	{
		return this.too_many_attempts_msg;
	}
	public DisplayMenu CreateDisplayMenu()
	{
		return this.disp_menu;
	}
	public PromptForPin CreatePromptForPin()
	{
		return this.prompt_pin;
	}
	public DisplayBalance CreateDisplayBalance()
	{
		return this.disp_bal;
	}
	public MakeDeposit CreateMakeDeposit()
	{
		return this.make_deposit;
	}
	public MakeWithdraw CreateMakeWithdraw()
	{
		return this.make_withdraw;
	}
	public Penalty CreatePenalty()
	{
		return this.penalty;
	}
        public StoreData CreateStoreData()
        {
            return this.store;
        }
        public IncorrectIdMsg CreateIncorrectIdMsg()
        {
            return this.id_msg;
        }
        public IncorrectLockMsg CreateIncorrectLockMsg()
        {
            return this.lock_msg;
        }
        public IncorrectUnlockMsg CreateIncorrectUnlockMsg()
        {
            return this.unlock_msg;
        }
        public NoFundsMsg CreateNoFundsMsg()
	{
		return this.no_funds;
	}
}
