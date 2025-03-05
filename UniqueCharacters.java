import java.util.Scanner;

public class UniqueCharacters {
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) str.charAt(length++);
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    public static char[] findUniqueCharacters(String str) {
        int len = getStringLength(str);
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[uniqueCount++] = current;
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) System.out.print(c + " ");
        
        sc.close();
    }
}
