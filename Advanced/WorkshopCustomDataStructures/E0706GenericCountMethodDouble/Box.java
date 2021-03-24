package SoftUniJavaProblemSolutions.Advanced.WorkshopCustomDataStructures.E0706GenericCountMethodDouble;


import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable <T>>{

    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void addValue(T value) {
        this.values.add(value);
    }

    public long countGreaterElements(T toCompare) {
        return this.values.stream().filter(e -> e.compareTo(toCompare) > 0).count();
    }

}

