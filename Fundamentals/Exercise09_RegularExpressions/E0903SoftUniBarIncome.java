package SoftUniJavaProblemSolutions.Fundamentals.Exercise09_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E0903SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<names>[A-Z][a-z]*)%[^|%&.]*<(?<product>\\w+)>[^|%&.]*\\|(?<count>[\\d]+)\\|[^|%&.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        double sum = 0.0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                String name = matcher.group("names");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double result = count * price;
                sum += result;
                System.out.printf("%s: %s - %.2f%n", name, product, result);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);

    }
}
