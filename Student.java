import java.util.Scanner;
class StudentDeteiles {
    //current class variable.
    private int studntId;
    private String studentName;
    private double studentFee;

    //seter method
    public void setstudntId(int studntId)
    {
        this.studntId=studntId;
    }
    public void setstudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public void setstudentFee(double studentFee)
    {
        this.studentFee=studentFee;
    }

    //geter method
    public int getstudntId()
    {
        return studntId;
    }
    public String getstudentName()
    {
        return studentName;
    }
    public double getstudentFee()
    {
        return studentFee;
    }

}

//main class
class Student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Student Id:");
        int id=sc.nextInt();

        System.out.println("Enter the Student Name:");
        String name=sc.next();

        System.out.println("Enter theStudent Fee:");
        double fee=sc.nextDouble();
        
        StudentDeteiles s=new StudentDeteiles();
        s.setstudntId(id);
        s.setstudentName(name);
        s.setstudentFee(fee);

        //print all method by object call
        System.out.println("Student Id:"+s.getstudntId());
        System.out.println("Student Id:"+s.getstudentName());
        System.out.println("Student Id:"+s.getstudentFee());
    }
}
