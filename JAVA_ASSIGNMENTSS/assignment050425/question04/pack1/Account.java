package pack1;

public abstract class Account 
{
	protected double balance;
	protected double amount;
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double bal)
	{
		this.balance=bal;
	}
 
}
