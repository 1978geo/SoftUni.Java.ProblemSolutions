package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExamPrep02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([#\\|])(?<itemName>[A-Za-z\\s]+)\\1(?<expDate>\\d{2}\\/\\d{2}\\/\\d{2})*\\1(?<calories>\\d{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int calories = 0;
        while (matcher.find()) {

            int currentCalories = Integer.parseInt(matcher.group("calories"));
                calories += currentCalories;
        }
        if (calories < 2000) {
            System.out.println("You have food to last you for: 0 days!");
        } else {
            System.out.printf("You have food to last you for: %d days!%n", calories / 2000);
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(text);
            while (matcher.find()){
                System.out.printf("Item: %s, Best before: %s, " +
                                "Nutrition: %s%n", matcher.group("itemName"),
                        matcher.group("expDate"), matcher.group("calories"));
            }
        }
    }
}
