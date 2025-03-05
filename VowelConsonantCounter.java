import java.util.Scanner;

public class VowelConsonantCounter {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] result = countVowelsAndConsonants(input);
        System.out.println("Vowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);
    }
}
