package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolVolume = Integer.parseInt(scanner.nextLine());
        int debitP1 = Integer.parseInt(scanner.nextLine());
        int debitP2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double p1waterfill = time * debitP1;
        double p2waterfill = time * debitP2;

        double percentWaterP1 = (p1waterfill * 100 / (p1waterfill + p2waterfill));
        double percentWater2 = (p2waterfill * 100 / (p1waterfill + p2waterfill));

        double percentFull = (100 * ((p1waterfill + p2waterfill) / poolVolume));
        double overflow = p1waterfill + p2waterfill - poolVolume;

        if (percentFull > 100) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", time, overflow);
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentFull, percentWaterP1, percentWater2);
        }
    }
}
