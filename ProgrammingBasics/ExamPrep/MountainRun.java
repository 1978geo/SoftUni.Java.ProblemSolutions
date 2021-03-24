package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double timeGeorgi = distanceMeters * timePerMeter;
        double finalTimeGeorgi = Math.floor(distanceMeters / 50) * 30 + timeGeorgi;

        if (finalTimeGeorgi < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", finalTimeGeorgi);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(finalTimeGeorgi - record));
        }


    }
}
