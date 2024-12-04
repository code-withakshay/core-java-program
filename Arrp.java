import java.util.Scanner;

public class CountTwos {
    // Function to count number of 2's in a number
    public static int countTwosInNumber(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    // Function to count number of 2's from 0 to the given number
    public static int countTwos(int n) {
        int totalCount = 0;
        for (int i = 0; i <= n; i++) {
            totalCount += countTwosInNumber(i);
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Get the count of 2's
        int result = countTwos(number);
        
        // Output the result
        System.out.println("Total number of 2's from 0 to " + number + ": " + result);
        
        scanner.close();
    }
}
