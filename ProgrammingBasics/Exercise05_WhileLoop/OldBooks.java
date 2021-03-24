package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise05_WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String input = scanner.nextLine();

        int bookCounter = 0;

        while (!input.equals("No More Books")) {

            if (input.equals(bookName)) {
                System.out.printf("You checked %d books and found it.", bookCounter);
                break;
            }
            bookCounter++;

            input = scanner.nextLine();
        }

        if (input.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCounter);
        }
    }
}
