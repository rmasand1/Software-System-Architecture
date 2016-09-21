/*
 Driver used for user input and is the main
 */
package project;
import java.io.*;
import MDAE.MDAEFSM;
import Output.OP;
import Accounts.*;
import Abstract_Factory.*;
/**
 *
 * @author Roshni
 */
public class Driver
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input=0;
    	int choice = 1;
	System.out.println("Select Account" );
	System.out.println("1. Account-1" );
	System.out.println("2. Account-2" );
	input=Integer.parseInt(br.readLine());
	if(input==1)
	{
            ConcreteFactory1 factory = new ConcreteFactory1();
	    OP output = new OP(factory,factory.GetDataStore());
	    MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    Account1 ac1 = new Account1(mdaefsm,factory.GetDataStore());
            String x,p,y;
            float a,d,w;
	    System.out.println("ACCOUNT 1" );
	    System.out.println("Menu Of Operations" );
	    System.out.println("1. open(String p,String y,float a)" );
            System.out.println("2. login(String y)" );
	    System.out.println("3. pin(String x)" );
            System.out.println("4. logout()" );
            System.out.println("5. balance()" );
	    System.out.println("6. deposit(float d)" );
	    System.out.println("7. withdraw(float w)" );
	    System.out.println("8. lock(String x)" );
	    System.out.println("9. unlock(String x)" );
	    System.out.println("10. Quit" );
	    while (true)
	    {
                System.out.println("  Select Operation: ");
	        System.out.println("1-open,2-login,3-pin,4-logout,5-balance,6-deposit,7-withdraw,8-lock,9-unlock");
        	input = Integer.parseInt(br.readLine());
                if(input==0)
                    continue;
                    if(input==10)
	            	break;
                    choice = input;
	            switch(choice)
	            {
                        case 1:   //open
                            System.out.println("Operation:  open(String p, String y, float a)");
                            System.out.println("Enter value of the parameter p(PIN):");
                            p =br.readLine();
                            System.out.println("Enter value of the parameter y(User ID:");
                            y = br.readLine();
                            System.out.println("Enter value of the parameter a(Balance:");
                            a = Float.parseFloat(br.readLine());
                            ac1.open(p,y,a);
                            break;

                        case 2:  //login
                            System.out.println("  Operation:  login(String y)");
                            System.out.println("  Enter value of parameter y(User ID):");
                            y = br.readLine();
                            ac1.login(y);
                            break;

                        case 3:  //pin
                            System.out.println("  Operation:  pin(String x)");
                            System.out.println("  Enter value of parameter x(Pin):");
                            x = br.readLine();
                            ac1.pin(x);
                            break;

                        case 4:  //logout
                            System.out.println("  Operation:  logout()");
                            ac1.logout();
                            break;

                        case 5:  //balance
                            System.out.println("  Operation:  balance()");
                            ac1.balance();
                            break;

                        case 6:  //deposit
                            System.out.println("  Operation:  deposit(float d)");
                            System.out.println("  Enter value of the parameter d(deposit):");
                            d = Float.parseFloat(br.readLine());
                            ac1.deposit(d);
                            break;

                        case 7:  // withdraw
                            System.out.println("  Operation:  withdraw(float w)");
                            System.out.println("  Enter value of the parameter w(withdraw):");
                            w = Float.parseFloat(br.readLine());
                            ac1.withdraw(w);
                            break;

                        case 8:  // lock
                            System.out.println("  Operation:  lock(String x)");
                            System.out.println("  Enter value of the parameter x(Pin):");
                            x = br.readLine();
                            ac1.lock(x);
                            break;

                        case 9:  // unlock
                            System.out.println("  Operation:  unlock(String x)");
                            System.out.println("  Enter value of the parameter x(Pin):");
                            x = br.readLine();
                            ac1.unlock(x);
                            break;

                        case 10: //quit
                            System.out.println("Quiiting Account 1");

                        default:
                            System.out.println("Invalid Choice");
                            break;
	            }
	        }
	        System.out.println("Thank you for using Account 1" );
		}
		else if(input==2)
		{
                    ConcreteFactory2 factory = new ConcreteFactory2();
                    OP output = new OP(factory,factory.GetDataStore());
                    MDAEFSM mdaefsm = new MDAEFSM(factory,output);
                    Account2 ac2 = new Account2(mdaefsm,factory.GetDataStore());
                    System.out.println("Account 2" );
                    int p,y,a,d,w,x;
                    System.out.println("MENU of Operations" );
                    System.out.println("1. OPEN(int p, int y,int a)" );
                    System.out.println("2. LOGIN()" );
                    System.out.println("3. PIN(int x)" );
                    System.out.println("4. LOGOUT()" );
                    System.out.println("5. BALANCE()" );
                    System.out.println("6. DEPOSIT(int d)" );
                    System.out.println("7. WITHDRAW(int w)" );
                    System.out.println("8. suspend()" );
                    System.out.println("9. activate()" );
                    System.out.println("10. close()" );
                    System.out.println("11. Quit " );
                    while (true)
                    {
	        	System.out.println("  Select Operation: ");
	        	System.out.println("1-OPEN,2-LOGIN,3-PIN,4-LOGOUT,5-BALANCE,6-DEPOSIT,7-WITHDRAW,8-suspend,9-activate,10-close");
                        input = Integer.parseInt(br.readLine());
                        if(input==0) continue;
                        if(input==11)
	            	break;
                        choice = input;
                        switch(choice)
                        {
		      	    case 1:   //OPEN
                                System.out.println("\n  Operation:  OPEN(int p, int y, int a)");
		      		System.out.println("   Enter value of the parameter p(pin):");
		      		p = Integer.parseInt(br.readLine());
		      		System.out.println("   Enter value of the parameter y(user ID):");
		      		y = Integer.parseInt(br.readLine());
                                System.out.println("   Enter value of the parameter a(balance):");
		      		a = Integer.parseInt(br.readLine());
		      		ac2.OPEN(p,y,a);
		      		break;

                            case 2:   //LOGIN
		      		System.out.println("\n  Operation:  LOGIN(int y)");
		      		System.out.println("   Enter value of the parameter y(user ID):");
		      		y = Integer.parseInt(br.readLine());
		      		ac2.LOGIN(y);
		      		break;

                            case 3:  //PIN
                                System.out.println("  Operation:  PIN(int x)");
		      		System.out.println("  Enter value of x(Pin):");
		      		x = Integer.parseInt(br.readLine());
		      		ac2.PIN(x);
		      		break;

                            case 4:   //LOGOUT
                                System.out.println("\n  Operation:  LOGOUT");
		      		ac2.LOGOUT();
		      		break;

                            case 5:  // BALANCE
                                System.out.println("  Operation:  BALANCE()");
	      			ac2.BALANCE();
	     			break;

                            case 6:  //DEPOSIT
		      		System.out.println("  Operation:  DEPOSIT(int d)");
		      		System.out.println("  Enter value of the parameter d(Deposit):");
		      		d = Integer.parseInt(br.readLine());
		      		ac2.DEPOSIT(d);
		      		break;

                            case 7:  // WITHDRAW
		      		System.out.println("  Operation:  WITHDRAW(int w)");
		      		System.out.println("  Enter value of the parameter w(Withdraw):");
		      		w = Integer.parseInt(br.readLine());
		      		ac2.WITHDRAW(w);
		      		break;

                            case 8:  // suspend
		      		System.out.println("  Operation:  suspend()");
		      		ac2.suspend();
		      		break;
		      	   
                            case 9:  // activate
		      		System.out.println("  Operation:  activate()");
		      		ac2.activate();
		      		break;

		      	    case 10:  // close
		      		System.out.println("  Operation:  close()");
		      		ac2.close();
          			break;

		      	  default:
		      			System.out.println("Invalid Choice");
		      			break;
                    }
	        }
	        System.out.println("Thanks for using Account-2" );
		}
    }
}
