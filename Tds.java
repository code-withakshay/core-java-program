// Write a program find the TDS of 10% from salary
import java.util.Scanner;
class Tds 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the your salary:");
		int s=sc.nextInt();
		float tds=s*10/100;
		System.out.println("TDS :"+tds);
	}
}
