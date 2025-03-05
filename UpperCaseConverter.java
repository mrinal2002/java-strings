import java.util.Scanner;

public class UpperCaseConverter {
    public static String toUpperCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String upperCaseBuiltIn = input.toUpperCase();
        String upperCaseManual = toUpperCaseManual(input);

        System.out.println("Uppercase (Built-in): " + upperCaseBuiltIn);
        System.out.println("Uppercase (Manual): " + upperCaseManual);
        System.out.println("Comparison Result: " + compareStrings(upperCaseBuiltIn, upperCaseManual));
    }
}
