package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class Salary3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOpenTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOpenTabs; i++) {
            String input = scanner.nextLine();

            if (input.equals("Facebook")) {
                salary = salary - 150;
            }
            if (input.equals("Instagram")) {
                salary = salary - 100;
            }
            if (input.equals("Reddit")) {
                salary = salary - 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }

    }
}
