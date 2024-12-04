
//Write a java program to check given number is prime or not using with returntype with no argument method?

import java.util.Scanner;
class WithReturnType 
{
	public static void main(String[] args) 
	{
		boolean k=prime();
		if(k)
			System.out.println("It is a prime number ");
		else
			System.out.println("It is not a prime number");
	}
	
	public static boolean prime()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
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
