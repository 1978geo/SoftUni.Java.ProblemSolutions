package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0604RawData2;

public class Cargo {
    // <CargoWeight> <CargoType>
    private int weight;
    private String cargoType;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.cargoType = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return cargoType;
    }
}