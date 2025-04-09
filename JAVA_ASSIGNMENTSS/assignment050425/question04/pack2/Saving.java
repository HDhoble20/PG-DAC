package pack2;
import pack1.Account;
import java.util.Scanner;
public class Saving extends Account
{
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Withdraw successful!!!.Remaining balance:"+balance);		
		}
		else 
		{
		   System.out.println("Insufficient Balance");	
		}
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposit Successful!!!.New Balance: "+balance);
	}
}
