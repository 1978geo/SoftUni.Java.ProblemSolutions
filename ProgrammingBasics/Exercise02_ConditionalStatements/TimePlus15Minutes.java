package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes >= 45) {
            hours = hours + 1;
            if (hours >= 24) {
                hours = (hours - 24);
            }
            minutes = (minutes + 15) % 60;
            System.out.printf("%d:%02d", hours, minutes);
        } else {
            if (hours >= 24) {
                hours = (hours - 24);
            }
            minutes = (minutes + 15);
            System.out.printf("%d:%02d", hours, minutes);
        }
        if (minutes == 60) {
            hours = hours + 1;
            if (hours >= 24) {
                hours = (hours - 24);
            }
            System.out.printf("%d:%02d", hours, minutes);
        }

    }
}
