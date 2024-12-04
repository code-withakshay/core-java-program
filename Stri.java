import java.util.Scanner;
class PalindromeRecursion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean k=palindrome(n,n,0);	
		if(k==true)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		
		}
		
	}
	
	public static boolean palindrome(int n,int temp,int rev)
	{
		
		if(n==0)
		{
			return rev==temp;
		}
		rev = (rev * 10) + (n % 10);
		return palindrome(n / 10,temp,rev);
	}
}
