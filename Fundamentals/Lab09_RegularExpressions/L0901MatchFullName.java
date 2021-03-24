package SoftUniJavaProblemSolutions.Fundamentals.Lab09_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L0901MatchFullName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String expression = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group(0) + " ");

        }
    }
}
