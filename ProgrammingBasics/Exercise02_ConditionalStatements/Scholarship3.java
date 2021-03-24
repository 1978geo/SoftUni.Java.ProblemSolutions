package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class Scholarship3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double incomeLv = Double.parseDouble(scanner.nextLine());
        double avgGrades = Double.parseDouble(scanner.nextLine());
        double miminalWage = Double.parseDouble(scanner.nextLine());


        double socialScholarship = Math.floor(miminalWage * 0.35);
        double gradesScholarship = Math.floor(avgGrades * 25);

        if (incomeLv < miminalWage && avgGrades >= 4.5) {
            if (socialScholarship > gradesScholarship)
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);

        }
        if (avgGrades >= 5.5) {
            if (socialScholarship <= gradesScholarship)
                System.out.printf("You get a scholarship for excellent results %.0f BGN", gradesScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}

