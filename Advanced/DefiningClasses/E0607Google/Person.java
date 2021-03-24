package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google;

import java.util.List;

public class Person {
   private String name;
    private Company company;
    private List<Pokemon> pokemon;
    private List<ParentName> parentsNames;
    private List<Children> children;
    private Car car;


    public Person(String name, Company company, List<Pokemon> pokemon, List<ParentName> parentsNames, List<Children> children, Car car) {
        this.name = name;
        this.company = company;
        this.pokemon = pokemon;
        this.parentsNames = parentsNames;
        this.children = children;
        this.car = car;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void add(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    public void add(ParentName parentName) {
        this.parentsNames.add(parentName);
    }

    public void add(Children children) {
        this.children.add(children);
    }

    @Override
    public String toString() {

            StringBuilder output = new StringBuilder();
            output.append(this.name).append(System.lineSeparator());
            output.append("Company:").append(System.lineSeparator());
            if (this.company != null) {
                output.append(this.company).append(System.lineSeparator());
            }
            output.append("Car:").append(System.lineSeparator());
            if (this.car != null) {
                output.append(this.car).append(System.lineSeparator());
            }
            output.append("Pokemon:").append(System.lineSeparator());
            this.pokemon.forEach(pokemon -> output.append(pokemon).append(System.lineSeparator()));
            output.append("Parents:").append(System.lineSeparator());
            this.parentsNames.forEach(parent -> output.append(parent).append(System.lineSeparator()));
            output.append("Children:").append(System.lineSeparator());
            this.children.forEach(child -> output.append(child).append(System.lineSeparator()));
            return output.toString();

    }



}

