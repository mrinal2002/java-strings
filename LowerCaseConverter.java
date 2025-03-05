import java.util.Scanner;

public class LowerCaseConverter {
    public static String toLowerCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); // Convert to lowercase
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

        String lowerCaseBuiltIn = input.toLowerCase();
        String lowerCaseManual = toLowerCaseManual(input);

        System.out.println("Lowercase (Built-in): " + lowerCaseBuiltIn);
        System.out.println("Lowercase (Manual): " + lowerCaseManual);
        System.out.println("Comparison Result: " + compareStrings(lowerCaseBuiltIn, lowerCaseManual));
    }
}
