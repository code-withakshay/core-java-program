//Write a java program to accept six marks of a student then find out total ,average and grade?
class Grade
{
	public static void main(String[] args) 
	{
		int m1=67,m2=45,m3=76,m4=56,m5=67,m6=64;
		int total=m1+m2+m3+m4+m5+m6;
		float avg=(float)total/6;
		System.out.println("Average="+avg);
		if(avg>=70)
			System.out.println("Grade: A Grade");
		else if(avg>=50)
			System.out.println("Grade: B Grade");
		else if(avg>=35)
			System.out.println("Grade: C Grade");
		else
			System.out.println("Sorry!! Failed");
	}
}
