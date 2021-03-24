package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google2;

public class Parent {

    private String name;
    private String dateOfBirth;

    public Parent(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.dateOfBirth);
    }
}



