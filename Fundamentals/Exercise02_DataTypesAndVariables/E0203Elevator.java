package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0203Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberPersons = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        int countCourses = (int)Math.ceil((double) numberPersons / elevatorCapacity);

        System.out.printf("%d", countCourses);

    }

}


