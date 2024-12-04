abstract class Car
{
	abstract void model();
	abstract void engine();
}
class Berraza extends Car
{
	public void model()
	{
		System.out.println("Berraza Car-Model method");
	}
	public void engine()
	{
		System.out.println("Berraza Car-Engien method");
	}
}

class  Interfacemain
{
	public static void main(String[] args) 
	{
		Berraza s1=new Berraza();
		s1.model();
		s1.engine();
	}
}
