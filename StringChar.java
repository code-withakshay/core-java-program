class College
{
	String collegeName;
	String collegeLocation;
	
	public College(String collegeName, String collegeLocation)
	{
		this.collegeName=collegeName;
		this.collegeLocation=collegeLocation;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	public String getCollegeLocation()
	{
		return collegeLocation;
	}
}
class Student
{
	private int studentId;
	private String studentName;
	private College college;//Has-A relationship
	
	public Student(int studentId, String studentName, College college)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.college=college;
	}
	
	public void DisplayData()
	{
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student College Name: "+college.getCollegeName());//refernce of College class
		System.out.println("Student College Location: "+college.getCollegeLocation());//refernce of College class
	}
}

class StringChar 
{
	public static void main(String[] args) 
	{
		College c=new College("Code with Akshay","Bihar");//create an object of College class
		
		Student s=new Student(101,"Akshay kumar",c);//create an object of Student class
		s.DisplayData();
		
		Student s1=new Student(102,"Mukesh kumar",c);//create an object of Student class
		s1.DisplayData();
	}
}
