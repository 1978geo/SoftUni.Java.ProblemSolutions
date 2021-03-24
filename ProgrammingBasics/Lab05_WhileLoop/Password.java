package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String passInput = "";


        while (!passInput.equals(password)) {

            passInput = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", userName);

    }
}
