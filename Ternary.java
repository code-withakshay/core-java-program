//Ternary operators:-
import java.util.Scanner;
class Ternary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the Scenod number:");
		int b=sc.nextInt();
		
		int c=(a>b)?a:b;
		System.out.println(c+"The Greatest number");
		
	}
}
		