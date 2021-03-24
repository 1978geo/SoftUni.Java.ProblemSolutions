package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0402Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printGrade(Double.parseDouble(scanner.nextLine()));

    }

    static void printGrade(double grade) {
        if (grade >= 2.00 && grade < 3.00) {
            System.out.print("Fail");
        } else if (grade >= 3.00 && grade < 3.50) {
            System.out.print("Poor");
        } else if (grade >= 3.50 && grade < 4.50) {
            System.out.print("Good");
        } else if (grade >= 4.50 && grade < 5.50) {
            System.out.print("Very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.print("Excellent");
        }
    }

}
