import java.util.Random;

public class StudentGrades {
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3]; // PCM subjects
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(41) + 60; // Marks between 60 and 100
            }
        }
        return marks;
    }

    public static String[][] calculateResults(int[][] marks) {
        String[][] results = new String[marks.length][5];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            String grade = (percentage >= 90) ? "A+" : 
                           (percentage >= 80) ? "A" : 
                           (percentage >= 70) ? "B" : "C";

            results[i][0] = String.valueOf(marks[i][0]);
            results[i][1] = String.valueOf(marks[i][1]);
            results[i][2] = String.valueOf(marks[i][2]);
            results[i][3] = String.valueOf(percentage) + "%";
            results[i][4] = grade;
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Phy\tChem\tMath\tPercentage\tGrade");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3] + "\t" + row[4]);
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5); // For 5 students
        String[][] results = calculateResults(marks);
        displayResults(results);
    }
}
