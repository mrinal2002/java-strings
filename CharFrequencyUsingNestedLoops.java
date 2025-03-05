import java.util.Scanner;

public class CharFrequencyUsingNestedLoops {
    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        // Finding frequency using nested loops
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // Skip already counted characters
            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0'; // Mark counted characters
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        // Store result
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] result = findFrequency(text);

        System.out.println("Character | Frequency");
        for (String res : result) {
            System.out.println("   " + res);
        }
        scanner.close();
    }
}
