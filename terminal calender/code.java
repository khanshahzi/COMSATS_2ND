package cgba;
import java.util.Scanner;
public class Cgba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year (e.g., 2025):");
        int year = input.nextInt();
System.out.println("Enter month number (1 to 12):");
        int month = input.nextInt();
        
            System.out.println("Please enter a value from 1 to 12.");
             printMonth(year, month);
    }
    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }
    public static void printMonthTitle(int year, int month) {
        System.out.println("       " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }
public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:  monthName = "January"; break;
            case 2:  monthName = "February"; break;
            case 3:  monthName = "March"; break;
            case 4:  monthName = "April"; break;
            case 5:  monthName = "May"; break;
            case 6:  monthName = "June"; break;
            case 7:  monthName = "July"; break;
            case 8:  monthName = "August"; break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numOfDays = getDaysInMonth(year, month);
        for (int i = 0; i < startDay; i++) {
            System.out.print("    "); // 4 spaces for alignment
        }
// Print all the days of the month
        for (int i = 1; i <= numOfDays; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println(); // new line after Saturday
        }
        System.out.println();
    }
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1800 = 3; // January 1, 1800 was a Wednesday
        int totalDays = getTotalNumberOfDays(year, month);
        return (totalDays + START_DAY_FOR_JAN_1800) % 7;
    }
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++) {
            total += isLeapYear(i) ? 366 : 365;
        }

        for (int i = 1; i < month; i++) {
            total += getDaysInMonth(year, i);
        }

        return total;
    }

    public static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // invalid month
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}