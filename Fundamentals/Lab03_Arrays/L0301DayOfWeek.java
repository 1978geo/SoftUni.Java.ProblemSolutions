package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0301DayOfWeek {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] dayName = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        if (1 <= input && input <= 7) {
            System.out.printf("%s", dayName[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
