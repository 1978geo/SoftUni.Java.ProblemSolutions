package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google2;

public class Child {
    private String name;
    private String dateOfBirth;

    public Child(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.dateOfBirth);
    }
}