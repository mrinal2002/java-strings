import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) return false;
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.next();
        String text2 = scanner.next();
        scanner.close();

        System.out.println("Anagram: " + isAnagram(text1, text2));
    }
}
