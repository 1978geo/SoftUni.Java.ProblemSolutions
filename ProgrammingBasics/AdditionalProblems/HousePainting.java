package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double houseLength = Double.parseDouble(scanner.nextLine());
        double houseRoofHeight = Double.parseDouble(scanner.nextLine());

        double greenPaintNeeded = (((houseHeight*houseHeight*2)-(1.2*2))+((houseHeight*houseLength)-(1.5*1.5))*2)/3.4;
        double redPaintNeeded = (houseHeight*houseLength*2 + houseHeight*houseRoofHeight)/4.3;

        System.out.printf("%.2f%n", greenPaintNeeded);
        System.out.printf("%.2f", redPaintNeeded);

    }
    }
