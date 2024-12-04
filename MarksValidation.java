import java.util.Scanner;

public class MarksValidation {
	
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter marks for Subject 1 (1-99): ");
        int sub1Marks = scanner.nextInt();

        System.out.print("Enter marks for Subject 2 (1-99): ");
        int sub2Marks = scanner.nextInt();

        if (sub1Marks > 0 && sub1Marks < 100 && sub2Marks > 0 && sub2Marks < 100)
		{
				 if (sub1Marks > sub2Marks) 
				 {
					System.out.println("Valid marks entered!");
				 } 
				 else 
				 {
					System.out.println("Invalid: Subject 1 marks should be greater than Subject 2 marks.");
				 }
        }
		else 
		{
			System.out.println("Invalid: Marks should be between 1 and 99.");
		}

    }
}
