//Write a program to create simple calculator using switch Statement 
import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char op;
		double n1,n2,res;
		
		System.out.println("+, -, *, or /");
		System.out.println("Enter the Operator");
		op=sc.next().charAt(0);
		
		System.out.print("Enter the First numer= ");
		n1=sc.nextDouble();
		
		System.out.print("Enter the Second numer= ");
		n2=sc.nextDouble();
		
		switch(op)
		{
			case '+':
					res=n1+n2;
					System.out.print(n1 + " + " + n2 + " = " + res);
					break;
					
			case '-':
					res=n1-n2;
					System.out.print(n1 + " - " + n2 + " = " + res);
					break;
					
			case '*':
					res=n1*n2;
					System.out.print(n1 + " * " + n2 + " = " + res);
					break;
					
			case '/':
					res=n1/n2;
					System.out.print(n1 + " / " + n2 + " = " + res);
					break;
					
			default:
					System.out.print("Invailed operator !! Try agin  ");
		}
	}
}
