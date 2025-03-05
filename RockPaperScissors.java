import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void displayStats(int userWins, int computerWins, int totalGames) {
        System.out.println("Total Games: " + totalGames);
        System.out.println("User Wins: " + userWins + " (" + (userWins * 100 / totalGames) + "%)");
        System.out.println("Computer Wins: " + computerWins + " (" + (computerWins * 100 / totalGames) + "%)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0, computerWins = 0, totalGames = 0;

        while (true) {
            System.out.println("Enter Rock, Paper, or Scissors (or Exit to stop): ");
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("Exit")) break;

            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            String winner = determineWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            totalGames++;
            System.out.println("Result: " + winner + " won!");
        }

        displayStats(userWins, computerWins, totalGames);
        scanner.close();
    }
}
