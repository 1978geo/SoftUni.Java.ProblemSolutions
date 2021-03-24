package SoftUniJavaProblemSolutions.Fundamentals.Lab07_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class L0704WordFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");

        Arrays.stream(info)
                .filter(i -> i.length()%2==0)
                .forEach(System.out::println);
    }
}
