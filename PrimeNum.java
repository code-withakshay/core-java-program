public class PrimeNum {
    public static void main(String[] args) { 
        int num = 1; // Initialize the number variable

        // Upper half of the pattern
        for (int i = 1; i <= 3; i++) { 
            // Print leading spaces for alignment
            for (int j = 3 - i; j > 0; j--) {
                System.out.print("   ");
            }

            // Print numbers and stars
            for (int j = 1; j <= 2 * i - 1; j++) { 
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(num + "  ");
                    num += 2; // Increment the number by 2
                }
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the pattern
        for (int i = 2; i >= 1; i--) { 
            // Print leading spaces for alignment
            for (int j = 3 - i; j > 0; j--) {
                System.out.print("   ");
            }

            // Print numbers and stars
            for (int j = 1; j <= 2 * i - 1; j++) { 
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(num + "  ");
                    num += 2; // Increment the number by 2
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}

		