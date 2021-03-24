package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03rabbits;


import java.util.ArrayList;
import java.util.List;

public class Cage {

    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }


    public void add (Rabbit rabbit) {
        if(this.data.size()<this.capacity){
            this.data.add(rabbit);
        }
    }
//    •	removeSpecies(String species) method - removes all JavaAdvancedProjects.rabbits by given species

    public void removeSpecies(String species){
        data.removeIf(rabbit -> rabbit.getSpecies().equals(species));
    }
//•	sellRabbit(String name) method - sell (set its available property to false without removing it from the collection)
//    the first rabbit with the given name, also return the rabbit

    public Rabbit sellRabbit(String name){
        Rabbit rabbit = null;
        for (int i = 0; i < data.size(); i++) {
            Rabbit rab = data.get(i);
            if(rab.getName().equals(name)){
                rab.setAvailable(false);
                rabbit = rab;
                break;
            }
        }
        return rabbit;
    }
public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit>rabbits = new ArrayList<>();

    for (int i = 0; i < data.size(); i++) {
        Rabbit rab = data.get(i);
        if(rab.getSpecies().equals(species)){
            rab.setAvailable(false);
            rabbits.add(rab);
        }
    }
    return rabbits;
}
    public boolean removeRabbitTwo(String name) {

        for (Rabbit rabbit: data) {
                if(rabbit.getName().equals(name)){
                    data.remove(rabbit);
                    return true;
                }
        }
        return false;
    }
    public boolean removeRabbit(String name) {

        for (Rabbit rabbit: data) {

        }

        for (int i = 0; i < this.data.size(); i++) {
            int index = -1;
            if(this.data.get(i).getName().equals(name)){
                index = i;
            }
            if(index!=-1){
                data.remove(index);
                return true;
            }
        }
        return false;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder out = new StringBuilder();
        out.append("Rabbits available at ").append(this.name).append(":").append(System.lineSeparator());
        for (Rabbit rabbit: data) {
            if (rabbit.isAvailable()) {
                out.append(rabbit.toString()).append(System.lineSeparator());
            }
        }
        return out.toString().trim();
    }
}

