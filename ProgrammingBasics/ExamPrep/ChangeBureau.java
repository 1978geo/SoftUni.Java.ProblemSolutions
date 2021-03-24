package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBitcoins = Integer.parseInt(scanner.nextLine());
        double chinaYuan = Double.parseDouble(scanner.nextLine());
        double comision = Double.parseDouble(scanner.nextLine());

        int bitcoinInLeva = numberBitcoins * 1168;
        double chinaYuanInUSD = chinaYuan * 0.15;
        double chinaYuanInLeva = chinaYuanInUSD * 1.76;

        double resultEUR = (bitcoinInLeva + chinaYuanInLeva) / 1.95;

        double finalResult = resultEUR * (100 - comision) / 100;

        System.out.printf("%.2f", finalResult);


    }
}
