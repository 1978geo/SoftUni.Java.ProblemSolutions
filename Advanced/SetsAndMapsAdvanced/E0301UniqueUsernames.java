package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E0301UniqueUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> usernames = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            usernames.add(name);
        }

        usernames.forEach(System.out::println);

    }
}
