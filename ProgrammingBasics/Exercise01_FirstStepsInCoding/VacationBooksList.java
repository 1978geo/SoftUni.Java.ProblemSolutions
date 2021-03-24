package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise01_FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int numberOfHoursPerDay = (numberOfPages/pagesPerHour)/numberOfDays;

        System.out.println(numberOfHoursPerDay);
    }
}
