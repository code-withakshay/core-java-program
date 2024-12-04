class Outer
{
	class Inner
	{
		void m1()
		{
			System.out.println("This is a M1-Inner Method");
		}
	}
	public static void main(String[] args)
	{
		Outer.Inner i=new Outer().Inner();
		i.m1();
	}
}