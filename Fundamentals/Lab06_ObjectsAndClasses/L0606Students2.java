package SoftUniJavaProblemSolutions.Fundamentals.Lab06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static bg.softuni.fundamentals.geo.L0606Students2.Students.getStudent;

public class L0606Students2 {

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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String toString() {
            return String.format("%s %s is %s years old", getFirstName(), getLastName(), getAge());
        }

        private static boolean IsStudentExisting(List<Students> allStudents, String firstName, String lastName) {
            for (Students student : allStudents) {
                if (student.getFirstName().equals(firstName) && (student.getLastName().equals(lastName))) {
                    return true;
                }
            }
            return false;
        }

        private static Students getStudent(List<Students>allStudents, String firstName, String lastName) {
            Students existingStudent = null;
            for (Students student : allStudents){
                if(student.getFirstName().equals(firstName) && (student.getLastName().equals(lastName))){
                    existingStudent = student;
                }
            } return existingStudent;
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

            if(IsStudentExisting(allStudents, firstName, lastName)){
          //  Students student = getStudent(Students, firstName, lastName);
//            student.setFirstName(firstName);
//            student.setLastName(lastName);
//            student.setAge(age);
//            student.setHomeTown(homeTown);

            } else
                {
                Students student = new Students(firstName, lastName, age, homeTown);

                allStudents.add(student);
            }


            input = scanner.nextLine();

        }

        String cityInput = scanner.nextLine();

        for (Students student : allStudents) {

            if(student.getHomeTown().equals(cityInput)) {

                System.out.println(student.toString());
            }
        }
    }
    private static boolean IsStudentExisting(List<Students>allStudents, String firstName, String lastName) {
        Students existingStudent = null;
        for (Students student : allStudents){
            if(student.getFirstName().equals(firstName) && (student.getLastName().equals(lastName))){
                existingStudent = student;
            }
        } return true;
    }
}
// first name, last name, age and hometown.
// : "{firstName} {lastName} is {age} years old.".

