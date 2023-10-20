//package bankingApp;
import java.util.*;

public class Working 
{
	public static void main(String[] args)                
	{
		Transaction obj=new Operation();
		int atmpin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine");
		System.out.println("Enter ATM Pin:");
		int pin=sc.nextInt();
		if(atmpin==pin)
		{

			while(true){
				System.out.println("1. View Balance");
				System.out.println("2. Amount Withdrawal");
				System.out.println("3. Deposit Amount");
				System.out.println("4. Exit");
				System.out.println("Enter a choice: ");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						obj.viewBalance();
					break;

					case 2:
						System.out.println("Enter the amount to be withdrawn ");
					double withdrawAmount=sc.nextDouble();
					obj.withdrawalAmount(withdrawAmount);
                    break;

					case 3:
						System.out.println("Enter the money to be deposited: ");
					double depositAmount=sc.nextDouble();
					obj.depositAmount(depositAmount);
					break;

					case 4:
						System.out.println("Collect your atm card \n Thankyou for using ATM Machine");
					     System.exit(0);
						 break;

					default:
						System.out.println("Please enter choice:");
				}
			}
		}
		else{
			System.out.println("Invalid pin");
			System.exit(0);
		}
	}
}



