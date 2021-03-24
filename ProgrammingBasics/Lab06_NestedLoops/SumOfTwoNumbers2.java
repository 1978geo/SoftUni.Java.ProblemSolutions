package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab06_NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int counter = 0;
        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                counter++;

                int sum = i + j;

                if (sum == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, sum);
                    isValid = true;
                    break;
                }
            }

            if (isValid == true){
                break;
            }
        }
        if (isValid == false){
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}