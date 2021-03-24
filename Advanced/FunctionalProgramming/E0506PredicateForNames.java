package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class E0506PredicateForNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] info = scanner.nextLine().split("\\s+");

        Predicate <String> lengthChecker = x -> x.length()<=n;

        Arrays.stream(info).filter(lengthChecker).forEach(e->System.out.println(e));
    }
}
