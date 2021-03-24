package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepE02MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int bitcoins = 0;
        int counter = 0;
        String[] rooms = scanner.nextLine().replace("|", " ").split(" ");

        for (int i = 0; i < rooms.length; i += 2) {
            counter++;
            if (!rooms[i].equals("potion") && !rooms[i].equals("chest")) {
                initialHealth = initialHealth - Integer.parseInt(rooms[i + 1]);
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", rooms[i]);
                } else {
                    System.out.printf("You died! Killed by %s.%n", rooms[i]);
                    System.out.printf("Best room: %d", counter);
                    break;
                }

            } else if (rooms[i].equals("potion")) {
                int currentHealth = initialHealth;
                initialHealth = initialHealth + Integer.parseInt(rooms[i + 1]);
                if (initialHealth > 100) {
                    initialHealth = 100;
                    System.out.printf("You healed for %d hp.%n", 100 - currentHealth);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                } else {
                    System.out.printf("You healed for %d hp.%n", Integer.parseInt(rooms[i + 1]));
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                }

            } else if (rooms[i].equals("chest")) {
                bitcoins += Integer.parseInt(rooms[i + 1]);
                System.out.printf("You found %d bitcoins.%n", Integer.parseInt(rooms[i + 1]));
            }
        }
        if (initialHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", initialHealth);
        }
    }
}
