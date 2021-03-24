package SoftUniJavaProblemSolutions.Fundamentals.Lab06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0605Students {

    public static class Students {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Students(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public String toString() {
            return String.format("%s %s is %s years old", getFirstName(), getLastName(), getAge());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Students> allStudents = new ArrayList<>();
        while (!input.equals("end")){
            String [] students = input.split("\\s+");

            String firstName = students[0];
            String lastName = students[1];
            String age = students[2];
            String homeTown = students[3];

            Students student = new Students(firstName, lastName, age, homeTown);

            allStudents.add(student);

            input = scanner.nextLine();

        }

        String cityInput = scanner.nextLine();

        for (Students student : allStudents) {

            if(student.getHomeTown().equals(cityInput)) {

                System.out.println(student.toString());
            }
        }
    }


}
   // first name, last name, age and hometown.
// : "{firstName} {lastName} is {age} years old.".

