package SoftUniJavaProblemSolutions.Fundamentals.Exercise01_BasicSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E0105Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }
        int counter = 0;
        while (counter < 4) {
            counter++;
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", userName);
                return;
            } else if (counter <=3){
                System.out.println("Incorrect password. Try again.");

            }
            if (counter == 4) {

                System.out.printf("User %s blocked!", userName);
            }
        }
    }
}
