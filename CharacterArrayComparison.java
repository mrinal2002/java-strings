import java.util.Scanner;
import java.util.Arrays;

public class CharacterArrayComparison {
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        scanner.close();

        char[] userDefinedChars = getCharacters(str);
        char[] builtInChars = str.toCharArray();

        System.out.println("Characters using custom method: " + Arrays.toString(userDefinedChars));
        System.out.println("Characters using toCharArray(): " + Arrays.toString(builtInChars));
        System.out.println("Comparison result: " + compareArrays(userDefinedChars, builtInChars));
    }
}
