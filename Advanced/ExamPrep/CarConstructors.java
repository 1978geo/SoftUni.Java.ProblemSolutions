package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

public class CarConstructors {
    public String brand;
    public String model;
    public int horsePower;

    public CarConstructors(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public CarConstructors(String brand, String model, int horsePower) {
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getInfo() {
        return String.format("The data is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower());
    }

}
