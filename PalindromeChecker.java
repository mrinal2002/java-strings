import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        String reversed = new StringBuilder(text).reverse().toString();
        return new String(original).equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        boolean iterative = isPalindromeIterative(text);
        boolean recursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean charArray = isPalindromeCharArray(text);

        System.out.println("Palindrome (Iterative): " + iterative);
        System.out.println("Palindrome (Recursive): " + recursive);
        System.out.println("Palindrome (Char Array): " + charArray);
    }
}
