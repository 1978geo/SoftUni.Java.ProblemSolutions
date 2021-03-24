package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0301Train {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] people = new int[n];

        int sumOfPeople = 0;

        for (int i = 0; i < n; i++) {

            people[i] = Integer.parseInt(scanner.nextLine());

            sumOfPeople += people[i];

            System.out.printf("%d ", people[i]);
        }

        System.out.println();
        System.out.printf("%d", sumOfPeople);
    }
}
