class Test2
{
	//static variable
	static int i=10;

	public static void main(String[] args)
	{
		System.out.println(i);  //10

		Test2 t=new Test2();
		System.out.println(t.i); //10

		System.out.println(Test2.i);//10	
	}
}