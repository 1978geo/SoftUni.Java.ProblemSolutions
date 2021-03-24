package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;


import java.util.Scanner;

public class E0410TopNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= digit; i++) {
            if (divisibleByEight(i) && holdOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean holdOddDigit(int digit) {

        int counter = 0;
        while (digit > 0) {
            if ((digit % 10) % 2 == 1) {
                counter++;
            }
            digit /= 10;
        }
        if (counter > 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean divisibleByEight(int digit) {

        int counter = 0;
        int sum = 0;
        while (digit > 0) {
            sum = sum + digit % 10;
            digit = digit / 10;
            if (sum % 8 == 0) {
                counter++;
            } else {
                counter = 0;
            }
        }
        if (counter > 0) {
            return true;
        } else {
            return false;
        }
    }
}


