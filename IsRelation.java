class Parents
{
	public void methodOne()
	{
		System.out.println("Parents Method");
	}
	
}
class Child extends Parents
{
	public void methodTwo()
	{
		System.out.println("Childe Method");
	}
}

class IsRelation 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Parents p=new Parents();
		p.methodOne();
		
		Child c=new Child();
		c.methodOne();
		c.methodTwo();
		
		Parents p1=new Child();
		p1.methodOne();
		
		p1.methodTwo();
	}
}
