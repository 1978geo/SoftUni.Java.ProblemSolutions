package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepL01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeOneStudentCount = Integer.parseInt(scanner.nextLine());
        int employeeTwoStudentCount = Integer.parseInt(scanner.nextLine());
        int employeeThreeStudentCount = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int sufficiencyPerHour = employeeOneStudentCount+employeeTwoStudentCount+employeeThreeStudentCount;

        double result = Math.ceil(studentsCount*1.0/sufficiencyPerHour);

        if (result>3){
            result = result + Math.floor((studentsCount*1.0/sufficiencyPerHour)/3);
        }

        System.out.printf("Time needed: %.0fh.", result);

    }
}
