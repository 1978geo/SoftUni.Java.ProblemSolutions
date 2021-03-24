package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E0507FindTheSmallestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int minNumber = items.stream().min(Integer::compareTo).get();

        Function<List<Integer>,Integer> findLast = list -> list.lastIndexOf(minNumber);

        System.out.println(findLast.apply(items));

    }
}
