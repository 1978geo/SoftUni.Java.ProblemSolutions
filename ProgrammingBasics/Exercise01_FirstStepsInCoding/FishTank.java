package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise01_FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longitudeCM = Integer.parseInt(scanner.nextLine());
        int widthCM = Integer.parseInt(scanner.nextLine());
        int heightCM = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double litersOfWater = ((longitudeCM*widthCM*heightCM)*0.001)*(1-(percent/100));

        System.out.printf("%.2f", litersOfWater);

    }
}
