package Main_package;
import java.util.Scanner;
import pack1.Account;
import pack2.Saving;
import pack3.Current;
public class Main 
{

  public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  Account a = null;
	 
	  System.out.println("SELECT ACCOUNT TYPE");
	  System.out.println("PRESS 1 FOR SAVING ACCOUNT");
	  System.out.println("PRESS 2 FOR CURRENT ACCOUNT");
	  System.out.println("ENTER YOUR CHOICE");
	  int accountType=sc.nextInt();
	  
	  	if(accountType==1)
	  		{
	  			a=new Saving();
	  		}
	  	else if(accountType==2)
	  		{
	  			a=new Current();
	  		}
	  	else
	  		{
	  			System.out.println("INVALID INPUT");
	  		}
	  	
	    System.out.println("-----------------------------------------");
        System.out.println("********ENTER ACCOUNT DETAILS********");
        System.out.println("-----------------------------------------");
        System.out.println("Enter Account Holder  Name:");
        String name=sc.nextLine();
               name=sc.nextLine();
        System.out.println("Enter Account  No:");
        int accNo=sc.nextInt();
        System.out.println("Enter Account Balance:");
        double bal=sc.nextDouble();
	  	int choice;
	  	char chk;
	  	do {            
	  		System.out.println("\n********** Menu **********");
	  		System.out.println("1. Deposit");
	  		System.out.println("2. Withdraw");
	  		System.out.println("3. Check Balance");
	  		System.out.println("4. Exit");
	  		System.out.print("Enter your choice: ");
	  		choice = sc.nextInt();
	  		
		  		switch (choice)
		  		{
		  		 case 1:
	                 System.out.print("Enter amount to deposit: ");
	                 double depositAmount = sc.nextDouble();
	                 a.deposit(depositAmount);
	                 break;
	             case 2:
	                 System.out.print("Enter amount to withdraw: ");
	                 double withdrawAmount = sc.nextDouble();
	                 a.withdraw(withdrawAmount);
	                 break;
	             case 3:
	            	 a.setBalance(bal);
	                 System.out.println("Current balance: " + a.getBalance());
	                 break;
	             case 4:
	                 System.out.println("Thank you for using the program. Exiting...");
	                 break;
	             default:
	                 System.out.println("Invalid choice. Please try again.");
	                 break;
		  		 }
	  		 System.out.println("DO YOU WANT TO CONTINUE? (y/n)");
	  		 chk=sc.next().charAt(0);
	  		 System.out.println("entered choice:"+chk);
             } while(chk!='n');	
	  		
	}

}
