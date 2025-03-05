import java.util.Scanner;

public class VowelConsonantIdentifier {
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacterType(str.charAt(i));
        }
        return result;
    }

    public static void displayClassification(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[][] classification = classifyCharacters(input);
        displayClassification(classification);
    }
}
