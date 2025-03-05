import java.util.Scanner;

public class BMICalculator {
    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            String status = getStatus(bmi);
            result[i] = new String[]{String.valueOf(data[i][1]), String.valueOf(weight), String.format("%.2f", bmi), status};
        }
        return result;
    }

    private static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void displayBMI(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiResults = computeBMI(data);
        displayBMI(bmiResults);
        sc.close();
    }
}
