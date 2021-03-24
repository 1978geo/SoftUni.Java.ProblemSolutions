package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class Salary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBrowsers = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numberBrowsers; i++) {

            String browserName = scanner.nextLine();

            switch (browserName) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
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
