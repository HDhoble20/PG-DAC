package pack3;
import pack1.Account;
import java.util.Scanner;

public class Current extends Account
{
	public void withdraw(double amount)
	{
		
			balance=balance-amount;
			System.out.println("Withdraw successful!!!.Remaining balance:"+balance);			
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposit Successful!!!.New Balance: "+balance);
	}
}

	