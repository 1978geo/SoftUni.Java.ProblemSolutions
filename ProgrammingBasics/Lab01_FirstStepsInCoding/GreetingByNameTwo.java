package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab01_FirstStepsInCoding;

import java.util.Scanner;

public class GreetingByNameTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

    }
}
