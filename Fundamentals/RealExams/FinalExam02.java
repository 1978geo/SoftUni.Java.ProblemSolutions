package SoftUniJavaProblemSolutions.Fundamentals.RealExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class FinalExam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String regex = "(\\*|@)(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<letOne>[A-Za-z])\\]\\|\\[(?<letTwo>[A-Za-z])\\]\\|\\[(?<letThree>[A-Za-z])\\]\\|$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if(matcher.find()){
                int one = matcher.group("letOne").charAt(0);
                int two = matcher.group("letTwo").charAt(0);
                int three = matcher.group("letThree").charAt(0);


                System.out.printf("%s: %d %d %d%n", matcher.group("tag"), one, two, three );

            }

            else{
                System.out.println("Valid message not found!");
            }

        }



    }
}
