package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google;

public class ParentName {
    String parentName;
    String parentBirthday;

    public ParentName(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    public String getParentName() {
        return parentName;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.parentName, this.parentBirthday);
    }
}
