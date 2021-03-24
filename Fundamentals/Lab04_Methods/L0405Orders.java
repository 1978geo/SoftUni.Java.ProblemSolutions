package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0405Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        int quantity = Integer.parseInt(scanner.nextLine());

        if (product.equals("coffee")) {
            coffee(product,quantity);
        } else if (product.equals("water")) {
            water(product,quantity);
        } else if (product.equals("coke")) {
            coke(product,quantity);
        } else if (product.equals("snacks")) {
            snacks(product,quantity);
        }

    }
    static void coffee(String product, int quantity) {
        double result = quantity * 1.50;
        System.out.printf("%.2f", result);
    }
    static void water(String product, int quantity) {
        double result = quantity * 1.00;
        System.out.printf("%.2f", result);
    }
    static void coke(String product, int quantity) {
        double result = quantity * 1.40;
        System.out.printf("%.2f", result);
    }

    static void snacks(String product, int quantity) {
        double result = quantity * 2.00;
        System.out.printf("%.2f", result);
    }
}
