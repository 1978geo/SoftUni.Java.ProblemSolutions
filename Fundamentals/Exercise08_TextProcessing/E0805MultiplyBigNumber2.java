package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0805MultiplyBigNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine().replaceFirst("^0+", "");
        int digit = Integer.parseInt(scanner.nextLine());
        StringBuilder newNumber = new StringBuilder();
        int forAddition = 0;

        if (digit == 0) {
            System.out.println(0);
            return;
        }

        for (int i = bigNumber.length() - 1; i >= 0; i--) {

            char currentDigit = bigNumber.charAt(i);

            int newDigit = Character.getNumericValue(currentDigit);

            int result = newDigit * digit + forAddition;

            if (i == 0) {
                newNumber.insert(0,result);
            }
            else {
                int lastDigit = result % 10;

                if (result > 10) {
                    newNumber.insert(0,lastDigit);
                    for (int j = 0; j < 1; j++) {

                        forAddition = result / 10;
                    }
                } else {
                    newNumber.insert(0,result);
                    forAddition = 0;
                }
            }
        }
                System.out.println(newNumber);
    }
}
