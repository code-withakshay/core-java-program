import java.util.*;
class CollPro 
{
	public static void main(String[] args) 
	{
		int[] arr={4,2,6,3,1};
		int sum_of_elm=arr.length+1;
		int sum=sum_of_elm*(sum_of_elm+1)/2;
		
		for(int i:arr)
		{
			sum=sum-i;
		}
		System.out.println("Missing Element "+sum);
		int[] newArr=Arrays.copyOf(arr,arr.length+1);
		newArr[newArr.length]=sum;
		Arrays.sort(arr);
		for(int i=newArr.length-1;i>=0;i--)
		{	
			System.out.print();
	}
}
