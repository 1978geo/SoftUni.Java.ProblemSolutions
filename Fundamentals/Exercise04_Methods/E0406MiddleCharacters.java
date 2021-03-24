package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;


import java.util.Scanner;

public class E0406MiddleCharacters {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String[] s = scanner.nextLine().split("");

        int length = s.length;

        printOddStringCharacter(s, length);
        printEvenStringCharacter(s, length);

    }

    static void printOddStringCharacter(String[] s, int length) {

        for (int i = 0; i < s.length; i++) {

            String ch = s[i];


            if (s.length % 2 != 0) {
                System.out.printf("%s", s[(s.length / 2)]);
                return;
            }
        }
    }

    static void printEvenStringCharacter(String[] s, int length) {

        for (int i = 0; i < s.length; i++) {

            String ch = s[i];
            if (s.length % 2 == 0) {
                System.out.printf("%s", s[(s.length / 2) - 1]);
                System.out.printf("%s", s[(s.length / 2)]);
                return;
            }
        }
    }
}
