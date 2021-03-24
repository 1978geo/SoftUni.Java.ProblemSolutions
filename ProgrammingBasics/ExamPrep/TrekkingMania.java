package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        double totalNumberOfPeople = 0;
        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numberOfGroups; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());

            totalNumberOfPeople = totalNumberOfPeople + numberOfPeople;

            if (numberOfPeople >= 1 && numberOfPeople < 6) {
                musala = musala + numberOfPeople;
            } else if (numberOfPeople >= 6 && numberOfPeople < 13) {
                montblanc = montblanc + numberOfPeople;
            } else if (numberOfPeople >= 13 && numberOfPeople < 26) {
                kilimanjaro = kilimanjaro + numberOfPeople;
            } else if (numberOfPeople >= 26 && numberOfPeople < 41) {
                k2 = k2 + numberOfPeople;
            } else if (numberOfPeople >= 41) {
                everest = everest + numberOfPeople;
            }
        }
        System.out.printf("%.2f%%%n", musala / totalNumberOfPeople * 100);
        System.out.printf("%.2f%%%n", montblanc / totalNumberOfPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro / totalNumberOfPeople * 100);
        System.out.printf("%.2f%%%n", k2 / totalNumberOfPeople * 100);
        System.out.printf("%.2f%%%n", everest / totalNumberOfPeople * 100);

    }
}
