package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsAtHotel = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;


        if (month.equals("May") || month.equals("October")) {

            studioPrice = 50.0;
            apartmentPrice = 65.0;
            if (nightsAtHotel > 7 && nightsAtHotel <= 14) {
                studioPrice *= 0.95;
            }
            if (nightsAtHotel > 14) {
                studioPrice *= 0.70;
                apartmentPrice *= 0.90;
            }
        } else if (month.equals("June") || month.equals("September")) {

            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (nightsAtHotel > 14) {
                studioPrice *= 0.80;
                apartmentPrice *= 0.90;
            }
        } else if (month.equals("July") || month.equals("August")) {

            studioPrice = 76.0;
            apartmentPrice = 77.0;
            if (nightsAtHotel > 14) {
                apartmentPrice *= 0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice * nightsAtHotel);
        System.out.printf("Studio: %.2f lv.", studioPrice * nightsAtHotel);
    }

}

