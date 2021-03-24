package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise01_FirstStepsInCoding;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfChefs = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45.0;
        double wafflesPrice = 5.8;
        double pancakePrice = 3.2;

        double cakeIncome = numberOfCakes*cakePrice;
        double wafflesIncome = numberOfWaffles*wafflesPrice;
        double pancakeIncome = numberOfPancakes*pancakePrice;
        
        double charityCampaignIncome = ((cakeIncome+wafflesIncome+pancakeIncome)*numberOfChefs*numberOfDays)*7/8;

        System.out.printf("%.2f",charityCampaignIncome);

    }
}
