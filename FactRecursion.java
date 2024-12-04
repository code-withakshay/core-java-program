import java.util.Scanner;
class FactRecursion  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number :");
		int n=sc.nextInt();//5
		
		//caller method
		System.out.println(factorial(n));
		
	
	}
	//callie method
	public static int factorial(int n)
	{
		if(n<0)
			return -1;
		
		if(n==0)
			return 1;
		
		return n*factorial(n-1);
	}
	
}



