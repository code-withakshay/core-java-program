import java.util.Scanner;
class Switch  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the option :");
		int option=sc.nextInt();
		
		switch(option)
		{
			case 100: System.out.println("It is a police number");
					  //break;
			case 103: System.out.println("It is a enquiry number");
					  //break;
			case 108: System.out.println("It is a emergency number");
					  //break;	  
			default : System.out.println("Invalid option");
		}
	}
}