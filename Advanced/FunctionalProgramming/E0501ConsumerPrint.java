package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E0501ConsumerPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Consumer<String> consumer = System.out::println;

        String[] info = scanner.nextLine().split("\\s+");

        Arrays.stream(info).forEach(consumer);
    }
}
