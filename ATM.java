package ATMInterface;
import java.util.*;
public class ATM {
	private static double balance=10000.0;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int choice;
		System.out.println("Welcome to the Atm Service Machine");
		
		while(true)
		{
			System.out.println("\nSelect the following choices");
			System.out.println("1.Cash Withdrawal from Account ");
			System.out.println("2.Deposit money into Account");
			System.out.println("3.Check Current Balance ");
			System.out.println("4.Exit");
			System.out.println("\nEnter your choice");
			choice=in.nextInt();
			
			switch(choice) {
			case 1:
				cashwithdraw(in);
				break;
			case 2:
				deposit(in);
				break;
			case 3:
				checkbalance();
				break;
			 }		
				
				
		}
			
		
		// TODO Auto-generated method stub

	}
	private static void checkbalance() {
		System.out.println("Your Current Account Balance is: "+balance);
	}
	
	private static void cashwithdraw(Scanner in)
	{
		double amount;
		System.out.println("Enter the withdrawal amount");
		amount=in.nextDouble();
		
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println(" Withdrawral successful!! Current account balance is:"+balance);
		}
		else if(amount<0) {
			System.out.println("Entered amount is invalid. enter a valid positive amount");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	private static void deposit(Scanner in)
	{
		double amount;
		System.out.println("Enter the amount to be deposited");
		amount=in.nextDouble();
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println(" deposite successfull. Your new account balance is:"+balance);
		}
		else
		{
			System.out.println("Invalid amount!! Please enter a valid  amount");
		}
	}

}