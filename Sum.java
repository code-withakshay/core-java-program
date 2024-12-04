class Sum
{
	public static void main(String[] args)
	{
		Sum s=new Sum();	
		s.m1();
	}
	public void m1()   //non static method.
	{
		int  a=10;
		int  b=20;
		int c=a+b;
		System.out.println("Sum of ",c);
	}
}