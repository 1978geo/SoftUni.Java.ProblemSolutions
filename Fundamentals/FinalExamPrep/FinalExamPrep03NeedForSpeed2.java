package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FinalExamPrep03NeedForSpeed2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, int[]> carArray = new TreeMap<>();
        String carName = "";
        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            carName = carInfo[0];
            int mileage = Integer.parseInt(carInfo[1]);
            int fuel = Integer.parseInt(carInfo[2]);
            int[] data = new int[]{mileage, fuel};
            carArray.put(carName, data);
        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] token = input.split(" : ");
            String command = token[0];
            carName = token[1];
            int amount = Integer.parseInt(token[2]);


            switch (command) {
                case "Drive":
                    int drivenFuel = Integer.parseInt(token[3]);
                    if (carArray.get(carName)[1] - drivenFuel < 0) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carArray.get(carName)[1] -= drivenFuel;
                        carArray.get(carName)[0] += amount;
                        System.out.printf("%s driven for %d kilometers. " +
                                "%d liters of fuel consumed.%n", carName, amount, drivenFuel);

                        if (carArray.get(carName)[0] >= 100000) {
                            System.out.printf("Time to sell the %s!%n", carName);
                            carArray.remove(carName);
                        }

                    }

                    break;
                case "Refuel":
                    if (carArray.get(carName)[1] + amount > 75) {
                        amount = 75 - carArray.get(carName)[1];

                    }
                        carArray.get(carName)[1] += amount;

                    System.out.printf("%s refueled with %d liters%n", carName, amount);
                    break;
                case "Revert":

                    if (carArray.get(carName)[0] - amount < 10000) {
                        carArray.get(carName)[0] = 10000;
                    } else {
                        carArray.get(carName)[0] -= amount;
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, amount);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;

            }

            input = scanner.nextLine();
        }

        carArray.entrySet().stream()
                .sorted((a, b) -> b.getValue()[0] - a.getValue()[0])
                .forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", e.getKey(),
                        e.getValue()[0], e.getValue()[1]));

    }
}
