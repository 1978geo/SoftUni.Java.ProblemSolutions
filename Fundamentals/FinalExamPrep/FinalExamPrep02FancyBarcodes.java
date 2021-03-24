package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExamPrep02FancyBarcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            String regex = "@(#+)(?<barcode>[A-Z]([A-Za-z0-9]+){4}[A-Z])@(#+)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);

            if (!matcher.find()) {
                System.out.println("Invalid barcode");
            } else {

                pattern = Pattern.compile("(?<digit>[0-9]+)");
                matcher = pattern.matcher(matcher.group("barcode"));
                StringBuilder sb = new StringBuilder();

                while (matcher.find()) {
                    sb.append(matcher.group("digit"));
                }
                if (sb.toString().length() > 0) {
                    System.out.println("Product group: " + sb);
                }
                if (sb.toString().length() == 0) {
                    System.out.println("Product group: 00");
                }
            }
        }
    }
}
