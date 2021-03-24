package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class FinalExamPrep01SecretChat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {

            String[] token = command.split("([:|]+)");

            switch (token[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(token[1]);
                    sb = new StringBuilder(message);
                    sb.insert(index, " ");
                    message = sb.toString();
                    System.out.println(message);

                    break;
                case "Reverse":
                    String substring = token[1];
                    if (message.contains(substring)) {
                        sb = new StringBuilder(substring);
                        int firstIndex = message.indexOf(substring);
                        String first = message.substring(0, firstIndex);
                        String second = message.substring(firstIndex + substring.length(), message.length());
                        String third = sb.reverse().toString();
                        message = first + second + third;
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                        break;
                    }

                    break;
                case "ChangeAll":
                    substring = token[1];
                    String replacement = token[2];
                    message = message.replace(substring, replacement);
                    System.out.println(message);
                    break;

                default:
                    System.out.println("default error");
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);

    }

}
