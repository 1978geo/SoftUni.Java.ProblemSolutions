package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class L0302SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> reservations = new TreeSet<>();


        while (!input.equals("PARTY")) {

            reservations.add(input);

            input = scanner.nextLine();
        }
        while (!input.equals("END")) {

            reservations.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(reservations.size());
        reservations.forEach(System.out::println);

    }
}
