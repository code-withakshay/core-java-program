class Customer
{
	 private double balance=10000d;
	
	public void deposit(int amount)
	{
		this.balance = this.balance + amount;
		System.out.println("Balance after deposit="+ this .balance);
	}
	
	public void withdraw(int withdraw)
	{
		this.balance = this.balance - withdraw;
		System.out.println("Balance after withdraw="+ this .balance);
	}
}
class Banck 
{
	public static void main(String[] args) 
	{
		Customer hacker=new Customer();
		
		hacker.balance=-1000d;
		hacker.deposit(2000);
		//hacker.withdraw(5000);
		
		
	}
}



