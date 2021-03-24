package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0209CenturiesToMinutes {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCenturies = Integer.parseInt(scanner.nextLine());

        int years = 100 * numberCenturies;

        int days = (int) (years * 365.2422);

        int hours = days * 24;

        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days " +
                "= %d hours = %d minutes", numberCenturies, years, days, hours, minutes);


    }
}
//1 centuries = 100 years = 36524 days = 876576 hours = 52594560 minutes
//•	Assume that a year has 365.2422 days