package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0409GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        if (input.equals("int")) {
            int lineOne = Integer.parseInt(scanner.nextLine());
            int lineTwo = Integer.parseInt(scanner.nextLine());

            int result = getMax(lineOne, lineTwo);
            System.out.print(result);
        } else if (input.equals("char")) {

            char lineOne = scanner.nextLine().charAt(0);
            char lineTwo = scanner.nextLine().charAt(0);
            char result = getMax(lineOne, lineTwo);
            System.out.print(result);
        } else if (input.equals("string")) {
            String lineOne = scanner.nextLine();
            String lineTwo = scanner.nextLine();
            String result = getMax(lineOne, lineTwo);
            System.out.print(result);
        }
    }

    static int getMax(int lineOne, int lineTwo) {
        return (Math.max(lineOne, lineTwo));

    }

    static char getMax(char lineOne, char lineTwo) {
        return (char) Math.max(lineOne, lineTwo);
    }

    static String getMax(String lineOne, String lineTwo) {
        if (lineOne.compareTo(lineTwo) >= 0) {

            return lineOne;
        } else {
            return lineTwo;
        }
    }
}


