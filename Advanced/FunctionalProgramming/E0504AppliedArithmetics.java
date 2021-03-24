package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class E0504AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();
        String command = scanner.nextLine();

        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(e -> e += 1).toArray();
        Function<int[], int[]> multiplyByTwo = arr -> Arrays.stream(arr).map(e -> e *= 2).toArray();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = addOne.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractOne(numbers);
                    break;
                case "multiply":
                    numbers = multiplyByTwo.apply(numbers);
                    break;
                case "print":
                    Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }

    public static int[] subtractOne(int[] numbers) {
        return Arrays.stream(numbers).map(e -> e -= 1).toArray();
    }
}
