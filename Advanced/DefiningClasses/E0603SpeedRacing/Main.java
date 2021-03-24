package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0603SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Car> carInfo = new LinkedHashMap<>();

        Car car = null;

        for (int i = 0; i < n; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");

            String carModel = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double costFuel = Double.parseDouble(tokens[2]);

            car = new Car(carModel,fuelAmount,costFuel, 0);
            carInfo.put(carModel, car);

        }
        String input = scanner.nextLine();
        while (!input.equals("End")){

            String [] tokens = input.split("\\s+");

            String carModel = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);

            car = carInfo.get(carModel);
            car.drive(amountOfKm);

            input = scanner.nextLine();
        }
        carInfo.values().forEach(e -> System.out.println(e));
    }

}
