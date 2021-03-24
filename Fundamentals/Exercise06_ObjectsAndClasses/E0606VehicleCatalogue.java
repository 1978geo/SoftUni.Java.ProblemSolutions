package SoftUniJavaProblemSolutions.Fundamentals.Exercise06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E0606VehicleCatalogue {

    static class VehicleInfo {

        String typeOfVehicle;
        String model;
        String color;
        int horsepower;

        public VehicleInfo(String typeOfVehicle, String model, String color, int horsepower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s%n",
                    getTypeOfVehicle().toUpperCase().charAt(0) + getTypeOfVehicle().substring(1),
                    getModel(), getColor(), getHorsepower());
        }
    }

    public static Double averageHorsePower(List<VehicleInfo> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        return vehicles.stream().mapToDouble(VehicleInfo::getHorsepower).sum() / vehicles.size();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();
        List<VehicleInfo> allVehicles = new ArrayList<>();

        while (!info.equals("End")) {

            String[] vehicleInfo = info.split("\\s+");

            VehicleInfo vehicle = new VehicleInfo(vehicleInfo[0], vehicleInfo[1],
                    vehicleInfo[2], Integer.parseInt(vehicleInfo[3]));

            allVehicles.add(vehicle);

            info = scanner.nextLine();
        }

        info = scanner.nextLine();

        while (!info.equals("Close the Catalogue")) {
            String model = info;

            allVehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.print(vehicle.toString()));

            info = scanner.nextLine();
        }
        List<VehicleInfo> cars = allVehicles.stream()
                .filter(vehicle -> vehicle.getTypeOfVehicle().
                        equals("data")).collect(Collectors.toList());

        List<VehicleInfo> trucks = allVehicles.stream()
                .filter(vehicle -> vehicle.getTypeOfVehicle().
                        equals("truck")).collect(Collectors.toList());


        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePower(cars));
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePower(trucks));

    }

}
