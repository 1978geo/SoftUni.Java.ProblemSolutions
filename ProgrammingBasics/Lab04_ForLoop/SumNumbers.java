package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab04_ForLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < countNum; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
