
//Write a java program to check given number is prime or not using with returntype with with argument method?

import java.util.Scanner;
class WithRetuWithArg 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		boolean k=prime(n);
		if(k)
			System.out.println("It is a prime number ");
		else
			System.out.println("It is not a prime number");
	}
	
	public static boolean prime(int n)
	{
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				return true;
			else
				return false;
	}
}
