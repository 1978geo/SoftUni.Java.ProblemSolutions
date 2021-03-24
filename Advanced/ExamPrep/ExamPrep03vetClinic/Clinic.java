package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03vetClinic;


import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
//    •	Method add(Pet pet) – adds an entity to the data if there is an empty cell for the pet.

    public Pet add(Pet pet) {
        Pet p = null;
        if (data.size() < capacity) {
            data.add(pet);
            p = pet;
            return p;
        }
        return p;
    }

//    •	Method remove(String name) – removes the pet by given name, if such exists, and returns boolean.

    public boolean remove(String name) {

        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.remove(data.get(i));
                return true;
            }


        }
        return false;
    }

    public Pet getPet(String name, String owner) {

        Pet p = null;

        for (int i = 0; i < data.size(); i++) {

            if (this.data.get(i).getName().equals(name) && this.data.get(i).getOwner().equals(owner)) {
                p = this.data.get(i);
                return p;
            }
        }
        return p;
    }

    public int getCount() {
        return this.data.size();
    }

    public Pet getOldestPet() {
        Pet pet = null;
        for (Pet pets : data) {
            if (pet == null || pet.getAge() < pets.getAge()) {
                pet = pets;
            }

        }
        return pet;
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder("The clinic has the following patients:");
        sb.append(System.lineSeparator());

        for (Pet pet : data) {

            sb.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());

        }
        return sb.toString().trim();
    }
        }
//•	getStatistics() – returns a String in the following format:
//        o	"
//        {name} {owner}
//        {name} {owner}
//        (…)"
