package SoftUniJavaProblemSolutions.Fundamentals.Exercise06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0605Students {

    public static class Students {
        String firstName;
        String secondName;
        double grade;

        public Students(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public double getGrade() {
            return grade;
        }

        public String studentInfo() {
            return String.format("%s %s: %.2f",
                    getFirstName(), getSecondName(), getGrade());
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Students> allStudents = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String[] students = input.split("\\s+");

            String firstName = students[0];
            String secondName = students[1];
            double grade = Double.parseDouble(students[2]);

            Students student = new Students(firstName, secondName, grade);

            allStudents.add(student);

        }

        allStudents.stream()
                .sorted((a1, a2) -> Double.compare(a2.getGrade(), a1.getGrade()))
                .forEach(student -> System.out.println(student.studentInfo()));

    }
}
