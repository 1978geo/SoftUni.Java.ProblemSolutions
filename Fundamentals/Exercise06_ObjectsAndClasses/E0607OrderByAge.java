package SoftUniJavaProblemSolutions.Fundamentals.Exercise06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E0607OrderByAge {


    public static class People{
        String name;
        String ID;
        int age;

        public People(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        public String personInfo(){
            return String.format("%s with ID: %s is %d years old.", getName(), getID(), getAge());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();

        List<People> allPerson = new ArrayList<>();

        while (!input.equals("End")){
            String [] data = input.split("\\s+");

            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            People people = new People(name, ID, age);

            allPerson.add(people);

            input = scanner.nextLine();
        }

        allPerson.stream()
                .sorted(Comparator.comparingInt(People::getAge))
                        .forEach(people -> System.out.println(people.personInfo()));

        //Stefan with ID: 524244 is 10 years old.
    }
}
