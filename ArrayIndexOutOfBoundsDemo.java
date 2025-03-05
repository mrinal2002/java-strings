import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing invalid index...");
        System.out.println("Name: " + names[index]); // This will throw ArrayIndexOutOfBoundsException
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Handling invalid index access...");
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic Exception Handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.close();

        // Uncomment to see the actual exception
        // generateException(names, index);

        handleException(names, index);
    }
}
