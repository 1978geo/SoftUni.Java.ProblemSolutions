package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int timeOfArrival = Integer.parseInt(scanner.nextLine());
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());

        int totalMinutesExam = (timeOfExam * 60 + minutesOfExam);
        int totalMinutesArrival = (timeOfArrival * 60 + minutesOfArrival);

        if ((totalMinutesExam - totalMinutesArrival) > 30) {
            if (totalMinutesExam - totalMinutesArrival < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start",
                        totalMinutesExam - totalMinutesArrival);
            } else if (totalMinutesExam - totalMinutesArrival >= 60) {
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start",
                        (totalMinutesExam - totalMinutesArrival) / 60,
                        (totalMinutesExam - totalMinutesArrival) % 60);
            }
        } else if (totalMinutesExam - totalMinutesArrival == 0) {
            System.out.println("On time");
        } else if ((totalMinutesExam - totalMinutesArrival) > 0 &&
                (totalMinutesExam - totalMinutesArrival) <= 30) {

            System.out.println("On time");
            System.out.printf("%d minutes before the start",
                    totalMinutesExam - totalMinutesArrival);
        } else if ((totalMinutesArrival - totalMinutesExam) > 0) {
            if (((totalMinutesArrival - totalMinutesExam) > 0)
                    && ((totalMinutesArrival - totalMinutesExam) < 60)) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start",
                        totalMinutesArrival - totalMinutesExam);
            } else if ((totalMinutesArrival - totalMinutesExam) >= 60) {
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start",
                        (totalMinutesArrival - totalMinutesExam) / 60,
                        (totalMinutesArrival - totalMinutesExam) % 60);
            }
        }
    }
}

