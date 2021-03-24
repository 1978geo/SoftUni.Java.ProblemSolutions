package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google;

public class Children {

    String childName;
    String childBirthday;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    public String getChildName() {
        return childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.childName, this.childBirthday);
    }
}
