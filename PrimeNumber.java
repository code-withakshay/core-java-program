//import java.util.Scanner;
class ReverseNum
{
    public static void main(String[] args)
    {
		int number = 123;
        int reversedNumber = reverse(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);    
    }
	
	public static int reverse(int number) 
	{
        // Base case: when the number becomes single-digit
        if (number < 10) 
		{
            return number;
        }
		else 
		{
            // Calculate the number of digits
            int digits = (int) Math.log10(number);
            // Reverse the digits recursively
            return (number % 10) * (int) Math.pow(10, digits) + reverse(number / 10);
		}
      }
}

    