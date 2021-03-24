package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepL01SoftUniReception2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsPerHour = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();

        int studentsCount = scanner.nextInt();

        int hours = 0;
        while (studentsCount>0){
            hours++;
            if(hours%4!=0){
                studentsCount = studentsCount-studentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
