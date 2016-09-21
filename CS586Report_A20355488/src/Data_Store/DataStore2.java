/*
DataStore for maintaining values of Account 2
 */
package Data_Store;
/**
 *
 * @author Roshni
 */
public class DataStore2 extends DataStore
{
        /* Temporary variables */
	public int temp_p;//for Pin
	public int temp_y;//for User ID
        public int temp_a;//for balance
	public int temp_d;//for deposit
	public int temp_w;//for withdraw

	/* Permanent Variables */
	public int pin;  // for Pin
        public int uid; //for Uid
        public int balance;// for balance
	public int d; // for deposit
	public int w; // for withdraw

        /*Methods to set the pin value and return it*/
        public int setPin()
	{
		return this.pin = this.temp_p;
	}
        public int getPin()
	{
		return this.pin;
	}
        /*Methods to set the uid value and return it*/
        public int setUid()
	{
		return this.uid = this.temp_y;
	}
	public int getUid()
	{
		return this.uid;
	}
        /*Methods to set the balance value and return it*/
        public int setBalance()
	{
		return this.balance = this.temp_a;
	}
        public int getBalance()
	{
		return this.balance;
	}
        /*Methods to set the deposit value and return it*/
        public void setDeposit()
	{
		this.d = this.temp_d;
	}
	public int getDeposit()
	{
		return this.d;
	}
        /*Methods to set the withdraw value and return it*/
        public void setWithdraw()
	{
	    this.w = this.temp_w;
	}
	public int getWithdraw()
	{
		return this.w;
	}
	/*Methods to compute the balance value after deposit*/
        public void computeBalanceAfterDeposit()
	{
		this.balance = this.balance + this.d;
		this.temp_a = this.balance;
	}
	/*Methods to compute the balance value after withdraw*/
        public void computeBalanceAfterWithdraw()
	{
		this.balance = this.balance - this.w;
		this.temp_a = this.balance;
	}
}
