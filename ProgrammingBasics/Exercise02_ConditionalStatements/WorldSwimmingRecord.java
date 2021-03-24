package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double worldRecSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSecondPerMeterIvan = Double.parseDouble(scanner.nextLine());

        double timeIvan = distanceMeters * timeSecondPerMeterIvan;
        double timesDistanceMetersLate;


        if (distanceMeters >= 15) {
            timesDistanceMetersLate = distanceMeters / 15;
            timeIvan = (timeIvan + (Math.floor(timesDistanceMetersLate) * 12.5));
        }

        double diff = Math.abs(timeIvan - worldRecSeconds);

        if (timeIvan < worldRecSeconds) {

            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
