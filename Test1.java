 class Desc
{
    public static void main(String []rgs)
	{
		int[] arr={12,11,5,8,32,0};
        for	(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
        }
		for (i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}