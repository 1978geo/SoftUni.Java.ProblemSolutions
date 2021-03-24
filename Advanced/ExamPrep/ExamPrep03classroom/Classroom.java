package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03classroom;


import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private int capacity;
    private List<Student> data;

    public Classroom(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getData() {
        return data;
    }

    public int getStudentCount() {
        return this.data.size();
    }

    public String registerStudent(Student student) {

        StringBuilder out = new StringBuilder();

        if (this.data.size() > this.capacity) {
            out.append("No seats in the JavaAdvancedProjects.classroom");

        }
        if (this.data.contains(student)) {
            out.append("Student is already in the JavaAdvancedProjects.classroom");

        } else {
            this.data.add(student);
            out.append("Added student ").append(this.data.get(data.size() - 1).getFirstName())
                    .append(" ").append(this.data.get(data.size() - 1).getLastName());

        }

        return out.toString();
    }

    public Student getStudent(String firstName, String lastName) {
        Student s = null;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getFirstName().equals(firstName)&&
                    data.get(i).getLastName().equals(lastName)){
                s = data.get(i);
            }
       }
            return s;
    }

    public String dismissStudent(Student student) {
        String s = "";
        int index = 0;
        for (int i = 0; i < data.size(); i++) {
            if (this.data.contains(student)) {
                index = i;
                s = String.format("Removed student %s %s", this.data.get(index).getFirstName(),
                        this.data.get(index).getLastName());
                data.remove(student);
                break;
            } else {
                s = "Student not found";
            }
        }
        return s;
    }

    public String getSubjectInfo(String subject){
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Subject: ").append(subject).append(System.lineSeparator());
        sb.append("Students:").append(System.lineSeparator());

        for (int i = 0; i < data.size(); i++) {

            if (data.get(i).getBestSubject().equals(subject)) {
                counter++;
            sb.append(data.get(i).getFirstName()).append(" ").append(data.get(i).getLastName()).append(System.lineSeparator());
            }
        }

        if(counter==0){
            sb=new StringBuilder();
            sb.append("No students enrolled for the subject");
        }
        return sb.toString().trim();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        out.append("Classroom size: ").append(getStudentCount()).append(System.lineSeparator());
        for (Student student:data) {

            out.append(student.toString()).append(System.lineSeparator());

        }

        return out.toString().trim();
    }
}
