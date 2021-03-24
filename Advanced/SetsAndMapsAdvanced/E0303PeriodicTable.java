package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E0303PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> periodTable = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");
            periodTable.addAll(Arrays.asList(input));
        }
        periodTable.forEach(e -> System.out.print(e + " "));
    }
}
