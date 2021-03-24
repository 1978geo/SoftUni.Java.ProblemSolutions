package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0604RawData2;

public class Engine {
    // <EngineSpeed> <EnginePower>
    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return this.enginePower;
    }
}
