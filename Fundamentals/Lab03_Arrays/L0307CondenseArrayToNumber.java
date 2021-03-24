package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0307CondenseArrayToNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        String [] input = value.split(" ");

        if (input.length>1){

            int [] nums = new int [input.length];

            int condensedSum = 0;
            int [] condensed = new int [input.length-1];

            for (int i = 0; i < input.length-1; i++) {
                nums[i] = Integer.parseInt(input[i]);
                nums[i+1] = Integer.parseInt(input[i+1]);
                condensed[i] = nums[i] + nums[i+1];

                condensedSum+= condensed[i];
            }

            System.out.printf("%d", condensedSum);
        }
            else if (input.length == 1) {
            System.out.printf("%s", value);
        }
    }
}
