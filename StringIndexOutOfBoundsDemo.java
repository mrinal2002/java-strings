import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String str) {
        System.out.println("Accessing invalid index...");
        System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleException(String str) {
        try {
            System.out.println("Handling invalid index access...");
            System.out.println(str.charAt(str.length())); // Accessing beyond valid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        scanner.close();

        // Uncomment to see the actual exception
        // generateException(str);

        handleException(str);
    }
}
