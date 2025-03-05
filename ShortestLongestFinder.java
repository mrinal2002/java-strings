import java.util.Scanner;

public class ShortestLongestFinder {
    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int spaceCount = 0;

        // Count the number of spaces to determine the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart);

        return words;
    }

    // Method to return a 2D array of words with their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Store word
            wordLengths[i][1] = String.valueOf(findLength(words[i])); // Store length
        }

        return wordLengths;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortestWord = wordsWithLengths[0][0];
        String longestWord = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (String[] entry : wordsWithLengths) {
            int length = Integer.parseInt(entry[1]);

            if (length < minLength) {
                minLength = length;
                shortestWord = entry[0];
            }
            if (length > maxLength) {
                maxLength = length;
                longestWord = entry[0];
            }
        }

        return new String[]{shortestWord, String.valueOf(minLength), longestWord, String.valueOf(maxLength)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Get words and their lengths
        String[] words = splitWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Find shortest and longest words
        String[] result = findShortestAndLongest(wordsWithLengths);

        // Display results
        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");
        for (String[] entry : wordsWithLengths) {
            System.out.println(entry[0] + "\t\t" + Integer.parseInt(entry[1]));
        }

        System.out.println("\nShortest Word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest Word: " + result[2] + " (Length: " + result[3] + ")");

        scanner.close();
    }
}
