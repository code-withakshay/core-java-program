//Write a java program tocheck to even and odd number?
import java.util.Scanner;
class  Even
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		if((n&1)==0)
			System.out.println(n+ " It is Even number");
		else
			System.out.println(n+ " It is Odd number");
			
	}
}
