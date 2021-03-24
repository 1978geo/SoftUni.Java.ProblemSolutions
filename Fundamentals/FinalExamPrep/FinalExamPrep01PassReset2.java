package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class FinalExamPrep01PassReset2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rawPassword = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String commands = scanner.nextLine();
        while (!commands.equals("Done")) {

            String[] orders = commands.split(" ");
            switch (orders[0]) {
                case "TakeOdd":

                    for (int i = 1; i < rawPassword.length(); i += 2) {
                        sb.append(rawPassword.charAt(i));
                    }
                    rawPassword = sb.toString();
                    System.out.println(rawPassword);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(orders[1]);
                    int endIndex = startIndex + Integer.parseInt((orders[2]));

                    String first = rawPassword.substring(0, startIndex);
                    String second = rawPassword.substring(endIndex, rawPassword.length());

                    rawPassword = first + second;

                        System.out.println(rawPassword);

                    break;
                case "Substitute":
                    String key = orders[1];
                    String replacement = orders[2];
                    if (!rawPassword.contains(key)) {
                        System.out.println("Nothing to replace!");
                    } else {
                        rawPassword = rawPassword.replace(key, replacement);
                        System.out.println(rawPassword);
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.println("Your password is: " + rawPassword);
    }
}
