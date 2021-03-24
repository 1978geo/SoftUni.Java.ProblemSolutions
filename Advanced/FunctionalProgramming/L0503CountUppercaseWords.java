package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L0503CountUppercaseWords {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split("\\s+");

        if(word[0]!=null && !word[0].isEmpty()){
            Predicate<String> upperCaseLetter = str -> Character.isUpperCase(str.charAt(0));

            List<String> capitalWords = Arrays.stream(word)
                    .filter(upperCaseLetter)
                    .collect(Collectors.toList());

            System.out.println(capitalWords.size());
            capitalWords.forEach(System.out::println);
        }

    }
}
