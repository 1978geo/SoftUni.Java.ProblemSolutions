package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        int hSpaceDesk = (int) (length/1.2);
        int wSpaceDesk = (int) ((width-1.00)/0.70);

        double numberOfFreeSpace = ((wSpaceDesk * hSpaceDesk) - 3.0);

        System.out.printf("%.0f", numberOfFreeSpace);

    }
}
