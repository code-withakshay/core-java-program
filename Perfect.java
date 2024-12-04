//Write a java program to check given number is perfect or not?
import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
			System.out.println("It is a Perfect number");
		else
			System.out.println("It is a not Perfect number");
	}
}
