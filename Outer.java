class Outer
{
	class Inner
	{
		public int add(int a,int b)
		{
			return a+b;
		}
		void m1()
		{
			System.out.println("This is a M1-Inner Method");
		}
	}
	public static void main(String[] args)
	{
		Outer.Inner i=new Outer().new Inner();
		int sum=i.add(12,3);
		System.out.println(sum);
		i.m1();
	}
}