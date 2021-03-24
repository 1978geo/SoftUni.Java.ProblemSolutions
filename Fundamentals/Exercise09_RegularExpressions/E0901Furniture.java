package SoftUniJavaProblemSolutions.Fundamentals.Exercise09_RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E0901Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0.0;

        List<String> furniture = new ArrayList<>();

        while (!input.equals("Purchase")) {

            String expression = ">>([\\w]+)<<([\\d]+(\\.?)([\\d?]+))[!]([\\d]+)";

            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String[] line = input.split("[> <!]+");
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(5));
                double currentSum = price * quantity;
                sum += currentSum;

                furniture.add(matcher.group(1));
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (int i = 0; i < furniture.size(); i++) {
            System.out.println(furniture.get(i));
        }
        System.out.printf("Total money spend: %.2f", sum);

    }
}
