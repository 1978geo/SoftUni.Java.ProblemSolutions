package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class MovingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int freeSpaceVolume = widthFreeSpace * lengthFreeSpace * heightFreeSpace;
        int sumNumberOfBoxes = 0;

        while (!input.equals("Done")) {

            int numberOfBoxes = Integer.parseInt(input);

            sumNumberOfBoxes += numberOfBoxes;

            if (freeSpaceVolume < sumNumberOfBoxes) {

                System.out.printf("No more free space! You need %d Cubic meters more.", (sumNumberOfBoxes - freeSpaceVolume));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", (freeSpaceVolume - sumNumberOfBoxes));
        }
    }
}
