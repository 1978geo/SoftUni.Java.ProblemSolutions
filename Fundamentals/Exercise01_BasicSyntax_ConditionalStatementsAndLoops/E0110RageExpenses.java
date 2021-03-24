package SoftUniJavaProblemSolutions.Fundamentals.Exercise01_BasicSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E0110RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int counterHeadset = 0;
        int counterMouse = 0;
        int counterKeyboard = 0;
        int counterDisplay = 0;


        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                counterHeadset++;
            }
            if (i % 3 == 0) {
                counterMouse++;
            }
            if (i%2 == 0 && i %3 ==0){
                counterKeyboard++;

            }
            if (i%4 == 0 && i %3 ==0){
                counterDisplay++;
            }
        }
        double rageExpenses = counterHeadset * headsetPrice + counterMouse * mousePrice +
                counterKeyboard * keyboardPrice + counterDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
