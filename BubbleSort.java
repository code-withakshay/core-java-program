 class Test 
	 {
    public static void main(String []rgs)
		{
        for	(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
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