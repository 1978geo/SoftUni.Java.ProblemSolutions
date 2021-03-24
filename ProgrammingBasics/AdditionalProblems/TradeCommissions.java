package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double tradeCommission = 0;

        if (cityName.equals("Sofia")) {
            if (sales <= 500 && sales >= 0) {
                System.out.printf("%.2f", tradeCommission = sales * 0.05);
            }
            if (sales <= 1000 && sales > 500) {
                System.out.printf("%.2f", tradeCommission = sales * 0.07);
            }
            if (sales <= 10000 && sales > 1000) {
                System.out.printf("%.2f", tradeCommission = sales * 0.08);
            }
            if (sales > 10000) {
                System.out.printf("%.2f", tradeCommission = sales * 0.12);
            }
            if (sales < 0) {
                System.out.println("error");
            }
        } else if (cityName.equals("Varna")) {
            if (sales <= 500 && sales >= 0) {
                System.out.printf("%.2f", tradeCommission = sales * 0.045);
            }
            if (sales <= 1000 && sales > 500) {
                System.out.printf("%.2f", tradeCommission = sales * 0.075);
            }
            if (sales <= 10000 && sales > 1000) {
                System.out.printf("%.2f", tradeCommission = sales * 0.10);
            }
            if (sales > 10000) {
                System.out.printf("%.2f", tradeCommission = sales * 0.13);
            }
            if (sales < 0) {
                System.out.println("error");
            }
        } else if (cityName.equals("Plovdiv")) {
            if (sales <= 500 && sales >= 0) {
                System.out.printf("%.2f", tradeCommission = sales * 0.055);
            }
            if (sales <= 1000 && sales > 500) {
                System.out.printf("%.2f", tradeCommission = sales * 0.08);
            }
            if (sales <= 10000 && sales > 1000) {
                System.out.printf("%.2f", tradeCommission = sales * 0.12);
            }
            if (sales > 10000) {
                System.out.printf("%.2f", tradeCommission = sales * 0.145);
            }
            if (sales < 0) {
                System.out.println("error");
            }
        } else {
            System.out.println("error");

        }

    }
}
