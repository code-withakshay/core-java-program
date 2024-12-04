interface A 
{
	public abstract void show();
	public void display();
	abstract void see();
	void view();
}
class B implements A 
{
	public void show()
	{
		System.out.println("Show Method");
	}
	public void display()
	{
		System.out.println("Display Method");
	}
	public void see()
	{
		System.out.println("See Method");
	}
	public void view()
	{
		System.out.println("View Method");
	}
}

class Test  
{
	public static void main(String[] args) 
	{
		A a=new B();
		a.show();
		a.display();
		a.see();
		a.view();
		
	}
}