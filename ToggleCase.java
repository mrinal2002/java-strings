import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder toggled = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) toggled.append(Character.toLowerCase(ch));
            else toggled.append(Character.toUpperCase(ch));
        }

        System.out.println("Toggled String: " + toggled);
        sc.close();
    }
}
