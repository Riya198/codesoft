//package bankingApp;

public class ATM
{
	private double balance;
	private double deposit;
	private double withdraw;

//default constructor
	ATM()
	{

	}

//getter and setter function
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getDepositAmount(){
		return deposit;
	}
	public void setDepositAmount(double deposit){
		this.deposit=deposit;
	}
	public double getwithdrawalAmount(){
		return withdraw;
	}
	public void setwithdrawalAmount(double withdraw){
		this.withdraw=withdraw;
	}
}
