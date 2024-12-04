//Write the program swap two number without using third variable.

import java.util.Scanner;
class Swap3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping a="+a+ " and b="+b);
		
		//Swapping Without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a+ " and b="+b);
	}
}
