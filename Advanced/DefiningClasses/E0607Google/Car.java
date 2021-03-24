package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google;

public class Car {
    String carModel;
    String carSpeed;

    public Car(String carModel, String carSpeed) {

        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.carModel, this.carSpeed);
    }
}
