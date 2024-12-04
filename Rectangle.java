import java.util.Scanner;
class Rectangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		double length=sc.nextDouble();
		System.out.println("Enter the Width of the rectangle:");
		double width=sc.nextDouble();
		double area=length*width;
		System.out.println("the Area of rectangle="+area);
	}
}