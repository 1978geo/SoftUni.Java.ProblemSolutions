package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16) {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            }
            if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }

        if (age < 16) {
            if (gender.equals("m")) {
                System.out.println("Master");
            } else if (gender.equals("f")) {
                System.out.println("Miss");
            }
        }

    }
}
