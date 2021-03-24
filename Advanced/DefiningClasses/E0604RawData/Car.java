package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0604RawData;

import java.util.Arrays;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;


    public Car(String[] parameters) {
        this.setModel(parameters[0]);
        this.setEngine(parameters);
        this.setCargo(parameters);
        this.setTires(parameters);
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String[] parameters) {
        int speed = Integer.parseInt(parameters[1]);
        int power = Integer.parseInt(parameters[2]);
        this.engine = new Engine(speed, power);
    }

    public void setCargo(String[] parameters) {
        int weight = Integer.parseInt(parameters[3]);
        String type = parameters[4];
        this.cargo = new Cargo(weight,type);
    }

    public void setTires(String[] parameters) {
        this.tires = new Tire[4];
        for (int i = 5, j = 0; i < parameters.length; i += 2, j++) {
            double pressure = Double.parseDouble(parameters[i]);
            int age = Integer.parseInt(parameters[i + 1]);
            this.tires[j] = new Tire(pressure, age);
        }
    }

    public boolean isValidTirePressure() {
        return Arrays.stream(this.tires).anyMatch(tire -> tire.getTirePressure() < 1);
    }

    public boolean isValidEnginePower() {
        return this.engine.getEnginePower() > 250;
    }

    public String getCargoType() {
        return this.cargo.getCargoType();
    }

    @Override
    public String toString() {
        return this.model;
    }

}
