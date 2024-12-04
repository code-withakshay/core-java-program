//Write a program to read gender and print the corresponding gender using switch statement
import java.util.Scanner;
class  Gender
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Gender(M/F):");
		char gender=sc.next().charAt(0);
		
		switch(gender)
		{
			case 'm': System.out.println("Your Gender Male");
					break;
			case 'M': System.out.println("Your Gender Male");
					break;
			case 'f': System.out.println("Your Gender Female");
					break;
			case 'F': System.out.println("Your Gender Female");
					break;
			default:
					System.out.println("Your Gender are Transgender");
		}
	}
}
