package SoftUniJavaProblemSolutions.Fundamentals.Lab08_TextProcessing;

import java.util.Scanner;

public class L0802RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < info.length; i++) {

            for (int j = 0; j < info[i].length(); j++) {
                sb.append(info[i]);
                System.out.print(info[i]);
            }
        }
    }
}


