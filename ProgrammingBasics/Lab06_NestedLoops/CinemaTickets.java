package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab06_NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String movieName = "";

        int studentTicketCounter = 0;
        int standardTicketCounter = 0;
        int kidTicketCounter = 0;
        int allTicketSum = 0;


        while (!input.equals("Finish")) {
            movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            String currentTicketType = "";
            int takenSeatsCounter = 0;
            boolean isValid = false;

            while (!ticketType.equals("End") && !ticketType.equals(("Finish"))) {

                currentTicketType = ticketType;
                takenSeatsCounter++;

                if (currentTicketType.equals("student")) {
                    studentTicketCounter++;
                }
                if (currentTicketType.equals("standard")) {
                    standardTicketCounter++;
                }
                if (currentTicketType.equals("kid")) {
                    kidTicketCounter++;
                }

                allTicketSum = studentTicketCounter + standardTicketCounter + kidTicketCounter;

                if (takenSeatsCounter == freeSeats) {
                    System.out.printf("%s - %.2f%% full.%n", movieName, takenSeatsCounter * 1.0 / freeSeats * 100);
                    break;
                }

                ticketType = scanner.nextLine();
            }

            if (ticketType.equals("End") || ticketType.equals("Finish")) {
                isValid = true;
                System.out.printf("%s - %.2f%% full.%n", movieName, takenSeatsCounter * 1.0 / freeSeats * 100);

            }
            input = scanner.nextLine();

        }

        System.out.printf("Total tickets: %d%n", allTicketSum);
        System.out.printf("%.2f%% student tickets.%n", studentTicketCounter * 1.0 / allTicketSum * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketCounter * 1.0 / allTicketSum * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidTicketCounter * 1.0 / allTicketSum * 100);

    }
}

