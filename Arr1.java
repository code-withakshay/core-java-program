//import java.util.Arrays;
class  Test
{
	int i=10;

	public static void main(String[] args)
	{	
		Test t1=new Test();
		Test t2=new Test();
		
		System.out.println(t1.i);//10
		System.out.println(t2.i);//10

		t1.i=100;

		System.out.println(t1.i);//100
		System.out.println(t2.i);//10		
	}
}
