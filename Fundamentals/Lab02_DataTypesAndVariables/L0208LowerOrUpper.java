package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0208LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (65 <= symbol && symbol <= 90) {

            System.out.println("upper-case");
        } else if (97 <= symbol && symbol <= 122) {
            System.out.println("lower-case");
        }
    }
}

