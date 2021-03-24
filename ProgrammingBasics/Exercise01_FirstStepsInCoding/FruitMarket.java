package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise01_FirstStepsInCoding;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawbPrice = Double.parseDouble(scanner.nextLine());
        double quantBanana = Double.parseDouble(scanner.nextLine());
        double quantOrange = Double.parseDouble(scanner.nextLine());
        double quantRaspb = Double.parseDouble(scanner.nextLine());
        double quantStrawb = Double.parseDouble(scanner.nextLine());

        double raspbPrice = strawbPrice*0.5;
        double orangePrice = raspbPrice*0.6;
        double bananaPrice = raspbPrice*0.2;

        double sumNeededMoney = ((bananaPrice*quantBanana)+(orangePrice*quantOrange)+(raspbPrice*quantRaspb)+(strawbPrice*quantStrawb));

        System.out.printf("%.2f", sumNeededMoney);

    }

    }

