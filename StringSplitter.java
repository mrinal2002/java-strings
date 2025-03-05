import java.util.Scanner;

public class StringSplitter {
    // Method to find the number of words and split manually
    public static String[] splitWords(String text) {
        int spaceCount = 0;
        
        // Count the number of spaces (which define word boundaries)
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1]; // Number of words = spaces + 1
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart); // Last word

        return words;
    }

    // Method to compare two arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Custom split method
        String[] customSplit = splitWords(text);

        // Using built-in split() method for comparison
        String[] builtInSplit = text.split(" ");

        // Display results
        System.out.println("Words (Custom Split): ");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("Words (Built-in Split): ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Comparing the results
        boolean isMatch = compareArrays(customSplit, builtInSplit);
        System.out.println("Do both methods produce the same result? " + isMatch);

        scanner.close();
    }
}
