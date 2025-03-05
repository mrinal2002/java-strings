import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String str, int start, int end) {
        System.out.println("Generating IllegalArgumentException...");
        System.out.println(str.substring(start, end)); // This will throw IllegalArgumentException if start > end
    }

    public static void handleException(String str, int start, int end) {
        try {
            System.out.println("Handling IllegalArgumentException...");
            System.out.println(str.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic Exception Handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        scanner.close();

        // Uncomment to see the actual exception
        // generateException(str, start, end);

        handleException(str, start, end);
    }
}
