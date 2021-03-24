package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0605CarSalesman;

//A Car has a model, engine, weight and color

public class Car {

    private String carModel;
    private Engine engine;

    private int weight;
    private String color;


    public Car(String carModel, Engine engine, int weight, String color) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String carModel, Engine engine) {
        this(carModel,engine,0,"n/a");

    }

    public Car(String carModel, Engine engine, String color) {
        this(carModel,engine,0,color);

    }

    public Car(String carModel, Engine engine, int weight) {
        this(carModel,engine,weight,"n/a");
    }

    public String getCarModel() {
        return carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {


        return String.format("%s:%n%s:%nPower: %s%nDisplacement: %s%n" +
                "Efficiency: %s%nWeight: %s%nColor: %s",
                this.carModel,this.engine.getModel(),engine.getPower(),
                (engine.getDisplacement() == 0 ? "n/a" : engine.getDisplacement()),
                engine.getEfficiency(),
        (this.weight == 0 ? "n/a" : this.weight),this.getColor());
    }
}
//FordFocus:
//        V4-33:
//        Power: 140
//        Displacement: 28
//        Efficiency: B
//        Weight: 1300
//        Color: Silver


//<CarModel>:
//<EngineModel>:
//        Power: <EnginePower>
//Displacement: <EngineDisplacement>
//Efficiency: <EngineEfficiency>
//Weight: <CarWeight>
//Color: <CarColor>
