public class Test 
{
    public static void main(String[] args) 
	{ 
        int num=1;
        for (int i=1;i<=3;i++) 
		{
            for (int j=3-i;j>0;j--) 
			{
                System.out.print("   "); 
			}
            for (int j=1;j<=2*i-1;j++) 
			{
                if (j%2==0) 
				{
                    System.out.print("* "); 
                } 
				else 
				{
                    System.out.print(num+"  "); 
                    num+=2; 
                }
            }
            System.out.println(); 
        }
		for (int i=2;i>=1;i--) 
		{
            
            for (int j=3-i;j>0;j--) 
			{
                System.out.print("  "); 
            }
            for (int j=1;j<=2*i-1;j++) 
			{
                if (j%2==0) 
				{
                    System.out.print("* "); 
                } 
				else 
				{
                    System.out.print(num+"  "); 
                    num+=2; 
                }
            }
            System.out.println(); 
        }
    }
}






































		