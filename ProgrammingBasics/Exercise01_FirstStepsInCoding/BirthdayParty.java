package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise01_FirstStepsInCoding;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double cakePrice = rent*0.2;
        double drinksPrice = cakePrice*0.55;
        double animatorPrice = rent/3;

        double partySum = (rent + cakePrice + drinksPrice + animatorPrice);

        System.out.println(partySum);

    }
}
