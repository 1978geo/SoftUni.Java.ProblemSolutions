package SoftUniJavaProblemSolutions.Advanced.WorkshopCustomDataStructures.E0701GenericBox;

public class Box <T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.value.getClass().getName(), value.toString());
    }
}

