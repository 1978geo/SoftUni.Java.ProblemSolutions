package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L0408MathPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number, power);

        System.out.println(new DecimalFormat().format(result));

    }

    static double getResult(double number, int power) {
        return Math.pow(number, power);
    }

    public static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++)
            result *= number;
        return result;
    }

}

