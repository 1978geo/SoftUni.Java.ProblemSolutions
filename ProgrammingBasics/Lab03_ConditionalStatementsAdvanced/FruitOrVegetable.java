package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        if (product.equals("banana") || product.equals("kiwi") || product.equals("apple")
                || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")) {
            System.out.println("fruit");
        } else if (product.equals("tomato") || product.equals("cucumber") ||
                product.equals("pepper") || product.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }


    }
}
