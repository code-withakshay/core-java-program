//import java.util.Scanner;
class TestAll 
{
	public static void main(String[] args) 
	{ 
		char k='A'; 
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(k<='Z')
					System.out.print(k++ +" ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
}
