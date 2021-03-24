package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03christmas;

import java.util.ArrayList;
import java.util.List;


public class Bag {

    private String color;
    private int capacity;
    private List<Present> data;


    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return data.size();
    }

    public Present add(Present present) {
        Present p = null;
        if (data.size() < capacity) {
            p = present;
            data.add(present);
            return p;
        }
        return p;
    }

    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {

            if (data.get(i).getName().equals(name)) {
                this.data.remove(this.data.get(i));
                return true;
            }
        }
        return false;
    }

    public Present heaviestPresent() {
        Present present = null;
        for (Present presents : data) {
            if (present == null || present.getWeight() < presents.getWeight()) {
                present = presents;
            }
        }
        return present;
    }
    public Present getPresent(String doll) {
        Present p = null;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(doll)) {
                p = this.data.get(i);
                return p;
            }
        }
        return p;
    }

    public String report(){
        StringBuilder out = new StringBuilder();
        out.append(getColor()).append(" bag contains:").append(System.lineSeparator());
        for (int i = 0; i < data.size(); i++) {
            out.append(data.get(i)).append(System.lineSeparator());

        }
        return out.toString().trim();
        }
    }

