//Write a program to read a weekday number and print weekday name using switch statement
import java.util.Scanner;
class WeekDay 
{
	//public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Week Day number(0-6) Only: ");
		int day=sc.nextInt();
		
		switch(day)
		{
			case 0: System.out.println("Sunday");
					break;
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			default:
					System.out.println("Invailed!! Enter the again vailed Day(0-6");
		}
	}
	
}
