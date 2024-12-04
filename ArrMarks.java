//Write a program take the user  marks find the total and average. 

import java.util.Scanner;

public class ArrMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements
        System.out.print("Enter the number of elements you want to store: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] numbers = new int[n];

        // Input the elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the total and average
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += numbers[i];
        }

        double average = (double) total / n;

        // Display the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

       // scanner.close();
    }
}