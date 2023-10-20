//package bankingApp;

class Operation implements Transaction
{
	ATM a1=new ATM();

	//overriding
	public void viewBalance()
	{
		System.out.println("Available Balance:"+a1.getBalance());
	}
	public void withdrawalAmount(double withdrawAmount)
	{
		if(withdrawAmount%500==0)
		{
		if(withdrawAmount<=a1.getBalance()){
		System.out.println("Collect your cash "+withdrawAmount);
		a1.setBalance(a1.getBalance()-withdrawAmount);
		viewBalance();
		}
		else{
			System.out.println("Insufficient Balance in your Account");
		}
	}
	else {
		System.out.println("Please enter the withdrawal amount in multiple of  500");
	}
}
	public void depositAmount(double depositAmount)
	{
		System.out.println(depositAmount+"Deposited Amount successfully !!");
		a1.setBalance(a1.getBalance()+depositAmount);
        viewBalance();
	}
}
