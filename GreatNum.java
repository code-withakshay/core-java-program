import java.util.Scanner;
class GreatNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		int max=(a>b)?a:b;
		System.out.println("The Greater number="+max);`
	}
}
