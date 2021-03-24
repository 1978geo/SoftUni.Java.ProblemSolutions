package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab01_FirstStepsInCoding;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());
        int a = 3;

        int projectTime = a * projectNumber;


        System.out.printf("The architect %s will need %d hours to complete %s project/s.", architectName, projectTime , projectNumber );
    }
    }

