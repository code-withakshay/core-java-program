class Swap
{
	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		System.out.println("After Swaping a=" +a+ " swap b=" +b);
		
		//without using third vraibale  swap Two numbers.
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swaping a=" +a+ " swap b=" +b);
	}
}