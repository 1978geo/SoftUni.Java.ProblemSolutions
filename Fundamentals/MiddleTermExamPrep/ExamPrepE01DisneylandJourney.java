package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepE01DisneylandJourney {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double journeyCost = Double.parseDouble(scanner.nextLine());
        int numberOfMonths = Integer.parseInt(scanner.nextLine());
        double moneySaved = 0;

            for (int i = 1; i <= numberOfMonths; i++) {
                if (i > 1 && i % 2 != 0) {
                    moneySaved = moneySaved - (moneySaved * 0.16);
                }
                if (i % 4 == 0) {
                    moneySaved = moneySaved + (moneySaved * 0.25);
                }
                moneySaved += journeyCost * 0.25;
            }
            if (moneySaved >= journeyCost) {
                System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", (moneySaved - journeyCost));
            }
            else  {
                System.out.printf("Sorry. You need %.2flv. more.", (journeyCost - moneySaved));
            }
        }
    }

