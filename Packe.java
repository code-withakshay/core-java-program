package in.notebook.www;
import in.notebook.www.Packe;
class Geeting
{
	void m1()
	{
		System.out.println("Welcome my Site");
	}
	void m2()
	{
		System.out.println("I Hope,... Better Exprince visit my site");
	}
}
class Add
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
}
class Mult extends Add
{
	public int mult(int c)
	{
		int d=c*c;
		return d;
	}
}


class Packe
{
	public static void main(String[] args)
	{
		Geeting g=new Geeting();
		
		g.m1();
		g.m2();
		
		Add a=new Add();
		//System.out.println(a.sum(10,20));
		Mult m=new Mult();
		System.out.println(m.mult(a.sum(10,20)));

}

