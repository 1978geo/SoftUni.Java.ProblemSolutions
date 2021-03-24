package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0604RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        getCars();

        String cargoType = reader.readLine();

        switch (cargoType) {
            case "fragile":
                cars.stream()
                        .filter(car -> car.getCargoType().equals("fragile"))
                        .filter(Car::isValidTirePressure)
                        .forEach(System.out::println);
                break;
            case "flamable":
                cars.stream()
                        .filter(car -> car.getCargoType().equals("flamable"))
                        .filter(Car::isValidEnginePower)
                        .forEach(System.out::println);
                break;
        }
    }
    private static void getCars() throws IOException {
        int carsNumber = Integer.parseInt(reader.readLine());
        while (carsNumber-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            cars.add(new Car(tokens));
        }
    }
}