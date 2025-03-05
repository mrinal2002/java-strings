import java.util.Scanner;

public class SubstringComparison {
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
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

        String substringUsingCharAt = createSubstring(str, start, end);
        String substringUsingMethod = str.substring(start, end);

        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingMethod);
        System.out.println("Comparison result: " + compareStrings(substringUsingCharAt, substringUsingMethod));
    }
}
