package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E0302SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        int numberN = numbers[0];
        int numberM = numbers[1];

        Set<Integer> n = new LinkedHashSet<>();

        Set<Integer> m = new LinkedHashSet<>();

        for (int i = 0; i < numberN; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            n.add(input);
        }

        for (int i = 0; i < numberM; i++) {

            int input = Integer.parseInt(scanner.nextLine());
            m.add(input);

        }
        n.forEach(e -> {
            if(m.contains(e))
            System.out.print(e + " ");
        });
    }
}
