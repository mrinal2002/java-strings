import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getFirstDay(int year, int month) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    static void displayCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) days[1] = 29;
        System.out.println(" " + months[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getFirstDay(year, month);
        for (int i = 0; i < startDay; i++) System.out.print("    ");
        
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf(" %3d", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        displayCalendar(month, year);
    }
}
