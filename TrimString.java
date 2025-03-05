import java.util.Scanner;

public class TrimString {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder trimmedStr = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedStr.append(str.charAt(i));
        }
        return trimmedStr.toString();
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
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] indices = findTrimIndices(input);
        String manuallyTrimmed = createSubstring(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Manually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trims equal? " + compareStrings(manuallyTrimmed, builtInTrimmed));
    }
}
