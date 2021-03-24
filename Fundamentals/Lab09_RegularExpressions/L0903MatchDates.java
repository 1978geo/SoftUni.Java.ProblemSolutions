package SoftUniJavaProblemSolutions.Fundamentals.Lab09_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L0903MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        String expression = "(?<day>[\\d]{2})([./-])(?<month>[A-Z][a-z]{2})\\2(?<year>[\\d]{4})";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {

            String day = matcher.group(1);
            String month = matcher.group(3);
            String year = matcher.group(4);

            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    day, month, year);

        }

    }
}
