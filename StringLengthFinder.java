import java.util.Scanner;

public class StringLengthFinder {
    // Method to calculate string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Trying to access character at index 'count'
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index goes out of bounds, return count
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Calling the custom method
        int customLength = findLength(input);

        // Using built-in length() method for comparison
        int builtInLength = input.length();

        // Displaying the results
        System.out.println("Calculated Length (without length()): " + customLength);
        System.out.println("Actual Length (using length()): " + builtInLength);

        scanner.close();
    }
}
