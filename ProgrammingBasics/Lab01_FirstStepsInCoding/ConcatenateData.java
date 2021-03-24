package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab01_FirstStepsInCoding;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int Age = Integer.parseInt(scanner.nextLine());
        String Town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",firstName, lastName, Age, Town);

    }
}
