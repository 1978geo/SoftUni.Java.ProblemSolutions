package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputText = scanner.nextLine();
        String outputText = scanner.nextLine();

        if (inputText.equals("mm")) {
            if (outputText.equals("cm")) {
                double finalnNumber = number * 0.1;
                System.out.printf("%.3f", finalnNumber);
            } else if (outputText.equals("m")) {
                double finalNumber = number * 0.001;
                System.out.printf("%.3f", finalNumber);
            }
        }
        if (inputText.equals("cm")) {
            if (outputText.equals("mm")) {
                double finalnNumber = number * 10;
                System.out.printf("%.3f", finalnNumber);
            } else if (outputText.equals("m")) {
                double finalNumber = number * 0.01;
                System.out.printf("%.3f", finalNumber);
            }
        }
        if (inputText.equals("m")) {
            if (outputText.equals("cm")) {
                double finalnNumber = number * 100;
                System.out.printf("%.3f", finalnNumber);
            } else if (outputText.equals("mm")) {
                double finalNumber = number * 1000;
                System.out.printf("%.3f", finalNumber);
            }
        }


//
//        Входните данни се състоят от три реда, въведени от потребителя:
//•	Първи ред: число за преобразуване - реално число
//•	Втори ред: входна мерна единица - текст
//•	Трети ред: изходна мерна единица (за резултата) - текст
//        На конзолата да се отпечата резултатът от преобразуването на мерните
//        единици форматиран до третия знак след десетичната запетая.


    }
}
