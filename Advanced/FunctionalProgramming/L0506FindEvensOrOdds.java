package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class L0506FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] boundNumbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        String command = scanner.nextLine();

        Predicate<Integer>predicateEven = num -> num %2 ==0;
        Predicate<Integer>predicateOdd = num -> num %2 !=0;

        if (command.equals("even")){
            for (int i = boundNumbers[0]; i <=boundNumbers[1] ; i++) {
                if(predicateEven.test(i))
                System.out.print(i + " ");
            }
        }
        else{
            for (int i = boundNumbers[0]; i <=boundNumbers[1] ; i++) {
                if(predicateOdd.test(i))
                System.out.print(i + " ");
            }
        }
    }
}
