/*
DataStore for maintaining values of Account 1
 */
package Data_Store;
/**
 *
 * @author Roshni
 */
public class DataStore1 extends DataStore
{
        /*Temporary variables*/
	public String temp_p;//for Pin
	public String temp_y;//for Uid
        public float temp_a;//for balance
	public float temp_d;//for deposit
	public float temp_w;//for withdraw
        
	/*Permanent Variables */
	public String pin;  // for Pin
        public String uid; //for Uid
        public float balance;//for balance
	public float d;   // for Deposit
	public float w;   // for Withdraw

        /*Methods to set the pin value and return it*/
        public String setPin()
	{
		return this.pin = this.temp_p;
	}
        public String getPin()
	{
		return this.pin;
	}
        /*Methods to set the uid value and return it*/
        public String setUid()
	{
		return this.uid = this.temp_y;
	}
        public String getUid()
	{
		return this.uid;
	}
        /*Methods to set the balance value and return it*/
	public float setBalance()
	{
		return this.balance = this.temp_a;
	}
        public float getBalance()
	{
		return this.balance;
	}
        /*Methods to set the deposit value and return it*/
        public void setDeposit()
	{
		this.d = this.temp_d;
	}
        public float getDeposit()
	{
		return this.d;
	}
        /*Methods to set the withdraw value and return it*/
        public void setWithdraw()
	{
	    this.w = this.temp_w;
	}
	public float getWithdraw()
	{
		return this.w;
	}
        /*Methods to set the penalty value and subtract penalty from the balance*/
        public float setPenalty()
	{
		this.balance = this.balance - 20;
		this.temp_a = balance;
		return this.balance;
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
