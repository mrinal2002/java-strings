public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");
        // Uncomment to see the exception
        // generateException(); 

        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
