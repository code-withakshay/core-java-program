class Manager
{
	int managerId; 
	String managerName;
	public void acceptData(int managerId, String managerName)
	{
		this.managerId=managerId;
		this.managerName=managerName;
		//this.ShowData();
	}
	
	public void ShowData()
	{
		System.out.println("Manager Id="+managerId);
		System.out.println("Manager Name="+managerName);
	}
	
}
class Cloths 
{
	public static void main(String[] args)
	{
		System.out.println("This is Main-method");
		Manager m=new Manager();
		
		m.acceptData(101,"Akshay");
		m.ShowData();
	}
}