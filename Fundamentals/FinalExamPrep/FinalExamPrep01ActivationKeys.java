package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class FinalExamPrep01ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(rawKey);

        while (!input.equals("Generate")) {

            String[] info = input.split(">>>");
            String command = info[0];
            switch (command) {
                case "Contains":
                    String substring = info[1];
                    if (sb.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", sb, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    char[] oldChar = sb.toString().toCharArray();

                    if (info[1].equals("Upper")) {
                        int startIndex = Integer.parseInt(info[2]);
                        int endIndex = Integer.parseInt(info[3]);

                        for (int i = startIndex; i < endIndex; i++) {
                            oldChar[i] = Character.toUpperCase(oldChar[i]);
                        }

                        for (int i = 0; i < sb.toString().length(); i++) {
                            System.out.print(oldChar[i]);

                        }
                        System.out.println();
                        sb.setLength(0);
                        for (int i = 0; i < oldChar.length; i++) {
                            sb.append(oldChar[i]);
                        }

                    } else if (info[1].equals("Lower")) {

                        int startIndex = Integer.parseInt(info[2]);
                        int endIndex = Integer.parseInt(info[3]);

                        for (int i = startIndex; i < endIndex; i++) {
                            oldChar[i] = Character.toLowerCase(oldChar[i]);
                        }

                        for (int i = 0; i < sb.toString().length(); i++) {
                            System.out.print(oldChar[i]);
                        }
                        System.out.println();
                        sb.setLength(0);
                        for (int i = 0; i < oldChar.length; i++) {
                            sb.append(oldChar[i]);
                        }
                    }
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(info[1]);
                    int endIndex = Integer.parseInt(info[2]);
                    sb.replace(startIndex, endIndex, "");
                    System.out.println(sb);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print("Your activation key is: " + sb);

    }
}
