class FibSer
{
	public static void main(String[] args)
	{
		int num1=0,num2=1,num=10;
		int i=0;
		for(i=0;i<num;i++)
		{
			System.out.println(num1+ " ");
			int num3=num2+num1;
			num1=num2;
			num2=num3;
		}
		//System.out.println(num1+num2);
	}
}	