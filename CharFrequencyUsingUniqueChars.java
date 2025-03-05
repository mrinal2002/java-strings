import java.util.Scanner;

public class CharFrequencyUsingUniqueChars {
    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        char[] unique = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Checking if the character is unique
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount++] = ch;
            }
        }

        // Trim array to uniqueCount
        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find frequency of unique characters
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = findUniqueChars(text);
        int[] frequency = new int[256]; // ASCII character set

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Store unique characters and their frequency
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println("   " + row[0] + "      |    " + row[1]);
        }
        scanner.close();
    }
}
