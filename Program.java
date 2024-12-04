class Student
{
	private  int id;
	private String name;
	private double fee;
	
	//Constructor
	public Student(int id, String name, double fee)
	{
		this.id =id;
		this.name=name;
		this.fee=fee;
	}
	//setter method
	public void setsid(int id)
	{
		this.id=id;
	}
	public void setsname(String name)
	{
		this.name=name;
	}
	public void setsfee(double fee)
	{
		this.fee=fee;
	}
	
	//getter method
	public int getsid(int id)
	{
		return id;
	}
	public String getsname(String name)
	{
		return name;
	}
	public double getsfee(double fee)
	{
		return fee;
	}
	
	//desplay method
	 public void display()
	{
		 System.out.println("Student Id="+id);
		 System.out.println("Student Name="+name);
		 System.out.println("Student Fee="+fee);
	}
	
	
} 

 class Program
{
    public static void main(String[] args)
	{
		//Constructor method intilizations
		Student s=new Student(101,"Akshay", 20000d);
		s.display();
		
		//Setter Method intilizations
		s.setsid(205);
		s.setsname("code with akshay");
		s.setsfee(10000d);
		
		System.out.println("After updating method Value...!!!");
		s.display();
		
		
	}
}