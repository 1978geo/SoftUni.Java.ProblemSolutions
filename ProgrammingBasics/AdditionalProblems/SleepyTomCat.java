package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int timePlayedDaysOff = 127 * daysOff;
        int timePlayedWorkDays = 63*(365-daysOff);

        int allPlayedTime = timePlayedDaysOff+timePlayedWorkDays;
        int hours = Math.abs((allPlayedTime-30000)/60);
        int minutes = Math.abs((allPlayedTime-30000) % 60);


        if (allPlayedTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);

        }
        else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }












    }
}
