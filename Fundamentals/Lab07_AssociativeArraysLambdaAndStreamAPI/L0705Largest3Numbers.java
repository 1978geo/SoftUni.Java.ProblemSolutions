package SoftUniJavaProblemSolutions.Fundamentals.Lab07_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L0705Largest3Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList());

        for (int num : items) {
            System.out.print(num + " ");
        }
    }
}
