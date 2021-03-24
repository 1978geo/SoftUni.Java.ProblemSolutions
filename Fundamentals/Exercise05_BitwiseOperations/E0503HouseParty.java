package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0503HouseParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> guestsList = new ArrayList<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {

            String[] people = scanner.nextLine().split("\\s+");
            String name = people[0];
            if (people.length == 3) {
                if (guestsList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsList.add(name);
                }
            }
            if (people.length == 4) {
                if (!guestsList.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else
                    guestsList.remove(name);
            }
        }
        for (int i = 0; i < guestsList.size(); i++) {

            System.out.printf("%s%n", guestsList.get(i));
        }
    }
}

