package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0604RawData2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            int count = 0;
            for (int j = 5; j < tokens.length; j += 2) {
                double tierPressure = Double.parseDouble(tokens[j]);
                int tierAge = Integer.parseInt(tokens[j + 1]);
                tires[count] = new Tire(tierPressure, tierAge);
                count++;
            }
            Car car = new Car(model, engine, cargo, tires);
            cars.putIfAbsent(model, car);
        }

        String newCargoType = scan.nextLine();
        for (Car car : cars.values()) {
            if ("flamable".equals(newCargoType)
                    && "flamable".equals(car.getCargo().getType())
                    && car.getEngine().getEnginePower() > 250) {
                System.out.println(car);
            } else if ("fragile".equals(newCargoType)
                    && "fragile".equals(car.getCargo().getType())
                    && car.hasTierWithLessPressureThanOne()) {
                System.out.println(car);
            }
        }
    }
}