package SoftUniJavaProblemSolutions.Fundamentals.Lab06_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L0602SumBigNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNumber.add(secondNumber);

        System.out.printf("%d",sum);

    }
}
