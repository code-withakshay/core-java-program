//Write java program to display GCD (Greatest Common Divisor) of two numbers?
import java.util.Scanner;
class Gcd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the sceond number");
		int b=sc.nextInt();
		
		int gcd=0;
		//int a=12,b=18,gcd=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}	
		 System.out.println("GDC of Two numberis="+gcd);
	}
}
