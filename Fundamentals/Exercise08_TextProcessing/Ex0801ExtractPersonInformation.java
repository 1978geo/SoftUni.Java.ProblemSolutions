package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class Ex0801ExtractPersonInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String text = scanner.nextLine();

            int nameStart = text.indexOf("@");
            int endName = text.lastIndexOf("|");

            String name = text.substring(nameStart + 1, endName);

            int ageStart = text.indexOf("#");
            int endAge = text.lastIndexOf("*");

            String age = text.substring(ageStart + 1, endAge);

            System.out.printf("%s is %s years old.%n", name, age);

        }

    }
}
