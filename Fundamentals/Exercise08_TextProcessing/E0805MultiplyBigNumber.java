package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0805MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int forAddition = 0;
        String bigNumber = scanner.nextLine().replaceFirst("^0+", "");
        int digit = Integer.parseInt(scanner.nextLine());
        StringBuilder newNumber = new StringBuilder();

        if (digit == 0) {
            System.out.println(0);
            return;
        }

        for (int i = bigNumber.length() - 1; i >= 0; i--) {

            char currentDigit = bigNumber.charAt(i);

            int newDigit = Character.getNumericValue(currentDigit);

            int result = newDigit * digit + forAddition;

            if (i == 0) {
                int reversed = 0;
                while (result != 0) {
                    int myDigit = result % 10;
                    reversed = reversed * 10 + myDigit;
                    result /= 10;
                }
                newNumber.append(reversed);
                break;
            }
            int lastDigit = result % 10;

            if (result > 10) {
                newNumber.append(lastDigit);
                for (int j = 0; j < 1; j++) {

                    forAddition = result / 10;
                }
            } else {
                newNumber.append(result);
                forAddition = 0;
            }
        }
        for (int i = newNumber.length() - 1; i >= 0; i--) {
            System.out.print(newNumber.charAt(i));
        }
    }
}
