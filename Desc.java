 import java.util.*;
  class Desc
{
    public static void main(String[] args)
	{
		String str="101101";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='1')
			{
				sum+=1;
			}
		}
		System.out.println(sum);
		
	}
}
