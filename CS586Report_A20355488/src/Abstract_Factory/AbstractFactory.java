/*Abstract Class for Factory of Account1 and Account2*/
package Abstract_Factory;
import Data_Store.*;
import Strategy.*;

/**
 *
 * @author Roshni
 */
public interface AbstractFactory {
    public DataStore CreateDataStore();
    public StoreData CreateStoreData();
    public IncorrectIdMsg CreateIncorrectIdMsg();
    public IncorrectPinMsg CreateIncorrectPinMsg();
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg();
    public DisplayMenu CreateDisplayMenu();
    public MakeDeposit CreateMakeDeposit();
    public DisplayBalance CreateDisplayBalance();
    public PromptForPin CreatePromptForPin();
    public MakeWithdraw CreateMakeWithdraw();
    public Penalty CreatePenalty();
    public IncorrectLockMsg CreateIncorrectLockMsg();
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg();
    public NoFundsMsg CreateNoFundsMsg();
}
