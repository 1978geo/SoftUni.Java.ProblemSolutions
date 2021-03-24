package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google;
// •	"<Name> company <companyName> <department> <salary>"
public class Company {

        String companyName;
        String department;
        Double salary;

    public Company(String companyName, String department, Double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.companyName, this.department, this.salary);
    }
}
