package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise06_NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);

            String input = scan.nextLine();
            int primeSum = 0;
            int nonPrimeSum = 0;

            while (!input.equals("stop")) {
                boolean isPrime = true;
                int temp;
                int num = Integer.parseInt(input);
                if (num < 0) {
                    input = scan.nextLine();
                    System.out.println("Number is negative.");
                    continue;
                }
                for (int i = 2; i <= num / 2; i++) {
                    temp = num % i;
                    if (temp == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += num;
                } else {
                    nonPrimeSum += num;
                }
                input = scan.nextLine();
            }

            System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
            System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
        }
    }
}
