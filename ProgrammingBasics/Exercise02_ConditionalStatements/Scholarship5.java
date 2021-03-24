package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class Scholarship5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double incomeLv = Double.parseDouble(scanner.nextLine());
        double avgGrades = Double.parseDouble(scanner.nextLine());
        double mininalWage = Double.parseDouble(scanner.nextLine());


        double socialScholarship = Math.floor(mininalWage * 0.35);
        double gradesScholarship = Math.floor(avgGrades * 25);

        if (avgGrades > 4.5 && avgGrades < 5.5) {
            if (incomeLv < mininalWage) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }

        } else if (avgGrades >= 5.5) {
            if (gradesScholarship >= socialScholarship) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", gradesScholarship);
            }
            if (socialScholarship > gradesScholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}


