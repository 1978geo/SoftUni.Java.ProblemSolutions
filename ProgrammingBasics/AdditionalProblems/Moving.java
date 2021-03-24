package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;

        String inputCommand = scanner.nextLine();

        boolean noMoreSpace = false;

        int sumBoxes = 0;
        while (!inputCommand.equals("Done")){
            int currentBoxes = Integer.parseInt(inputCommand);

            sumBoxes = sumBoxes + currentBoxes;

            if (sumBoxes > volume){
                noMoreSpace = true;
                break;
            }

            inputCommand = scanner.nextLine();
        }

        if (noMoreSpace == true){
            System.out.printf("No more free space! You need %d Cubic meters more.",
                    sumBoxes - volume);
        } else {
            System.out.printf("%d Cubic meters left.", volume - sumBoxes);
        }
    }
}