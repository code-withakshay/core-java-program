class StudentMarks
{
	public static void main(String[] args)
	{
		int marks1,marks2,marks3,marks4,marks5,marks6;
		marks1=45;
		marks2=67;
		marks3=56;
		marks4=76;
		marks5=61;
		marks6=40;
		int total=marks1+marks2+marks3+marks4+marks5+marks6;
		float avg=(float)total/6;
		System.out.println("Student of six subject total marks="+ total);
		System.out.println("Student of six subject Average marks="+ avg);
	}
}