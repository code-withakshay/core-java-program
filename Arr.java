import java.util.Scanner;
class  Arr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array size:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		//insert elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element:");
			arr[i]=sc.nextInt();
		}
		
		//Display Element
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
