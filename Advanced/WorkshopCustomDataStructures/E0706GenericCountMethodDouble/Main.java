package SoftUniJavaProblemSolutions.Advanced.WorkshopCustomDataStructures.E0706GenericCountMethodDouble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());;
        Box<Double> box = new Box<>();
        for (int i = 0; i < n; i++) {
            double value = Double.parseDouble(scanner.nextLine());;
            box.addValue(value);
        }

        Double toCompare = Double.parseDouble(scanner.nextLine());;
        System.out.println(box.countGreaterElements(toCompare));
    }
}

