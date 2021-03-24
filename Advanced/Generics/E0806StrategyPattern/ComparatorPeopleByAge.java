package SoftUniJavaProblemSolutions.Advanced.Generics.E0806StrategyPattern;

import java.util.Comparator;

public class ComparatorPeopleByAge implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return first.getAge()-second.getAge();
    }
}