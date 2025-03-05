import java.util.Scanner;

public class CharFrequencyUsingCharAt {
    // Method to find the frequency of characters using charAt()
    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256]; // ASCII character set size
        
        // Counting frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Counting unique characters
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) count++;
        }

        // Storing unique characters and their frequencies
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;  // Character ASCII value
                result[index][1] = frequency[i]; // Frequency
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        int[][] result = findFrequency(text);

        System.out.println("Character | Frequency");
        for (int[] row : result) {
            System.out.println("   " + (char) row[0] + "      |    " + row[1]);
        }
        scanner.close();
    }
}
