package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBrowsers = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int penaltyFacebook = 0;
        int penaltyInsta = 0;
        int penaltyReddit = 0;

        int finalSalary = 0;

        for (int i = 1; i <= numberBrowsers; i++) {

            String browserName = scanner.nextLine();

            if (browserName.equals("Facebook")) {
                penaltyFacebook = penaltyFacebook + 1;
            }
            if (browserName.equals("Instagram")) {
                penaltyInsta = penaltyInsta + 1;
            }
            if (browserName.equals("Reddit")) {
                penaltyReddit = penaltyReddit + 1;
            }

            finalSalary = (salary - penaltyFacebook * 150 - penaltyInsta * 100 - penaltyReddit * 50);

            if (finalSalary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        System.out.println(finalSalary);
    }
}
