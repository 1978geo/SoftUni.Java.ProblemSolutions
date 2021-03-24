package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int allTime = (firstTime + secondTime + thirdTime);

        int minutes = allTime / 60;
        int seconds = allTime % 60;

        if ( seconds <10) {
            System.out.printf("%d:%02d%n", minutes, seconds);
        } else {
            System.out.printf("%d:%2d%n", minutes, seconds);
        }

        System.out.printf("%d:%02d", minutes, seconds);





    }
}
