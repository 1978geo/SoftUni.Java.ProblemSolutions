package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E0508CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//       int [] numbers =  Arrays.stream(scanner.nextLine().split("\\s+")).
//                mapToInt(element -> Integer.parseInt(element)).toArray();
//
//
//        Function<int[], int[]> evenNumbers = arr -> Arrays.stream(arr).filter(e->e%2==0).toArray();
//        Function<int[], int[]> oddNumbers = arr -> Arrays.stream(arr).filter(e->e%2!=0).toArray();
//
//        Arrays.stream(evenNumbers.apply(numbers)).sorted().forEach(e -> System.out.print(e + " "));
//        Arrays.stream(oddNumbers.apply(numbers)).sorted().forEach(e -> System.out.print(e + " "));

        List<Integer> items = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (num1,num2)-> {

            if(num1%2==0 && num2%2!=0){
                return -1;
            }
            else if ( num1%2!=0 && num2%2==0) {
                return 1;
            }
            return num1.compareTo(num2);

        };

        items.stream().sorted(comparator).forEach(e-> System.out.print(e + " "));
    }
}
