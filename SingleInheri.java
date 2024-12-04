//write a java program to multipul interface  using multipul inheritance ? 
interface A
{
	void deposit();
	void withdraw();	
}
interface B
{
	void checkBalance();
}
interface C extends A,B
{
	void display();
}
class DisplayAll implements C
{
	public void deposit()
	{
		System.out.println("This is Deposit Interface-Method");
	}
	public void withdraw()
	{
		System.out.println("This is Withdraw Interface-Method");
	}
	public void checkBalance()
	{
		System.out.println("This is Check Balance Interface-Method");
	}
	public void display()
	{
		System.out.println("This is Display Interface-Method");
	}
}
class SingleInheri 
{
	public static void main(String[] args) 
	{
		DisplayAll d=new DisplayAll();
		
		d.deposit();
		d.withdraw();
		d.checkBalance();
		d.display();
	}
}
