import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String str) {
        System.out.println("Generating NumberFormatException...");
        int num = Integer.parseInt(str); // This will throw NumberFormatException if str is not a valid number
        System.out.println("Converted Number: " + num);
    }

    public static void handleException(String str) {
        try {
            System.out.println("Handling NumberFormatException...");
            int num = Integer.parseInt(str);
            System.out.println("Converted Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic Exception Handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String str = scanner.next();
        scanner.close();

        // Uncomment to see the actual exception
        // generateException(str);

        handleException(str);
    }
}
