//import java.util.Scanner;

class Animal
{
	void eat()
	{
		System.out.println("I can't say");
	}
}
class Lion extends Animal
{
	void eat()
	{
		System.out.println("Non-veg Type");
	}
}
class Hourse extends Animal
{
	void eat()
	{
		System.out.println("veg Type");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("Non-veg Type");
	}
}

class Main
{
	public Static void main(String[] args)
	{
		Animal a=new Lion();
		a.eat();
	}
}
