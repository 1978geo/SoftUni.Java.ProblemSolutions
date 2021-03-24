package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class FinalExamPrep01WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder travelStops = new StringBuilder(scanner.nextLine());

        String orders = scanner.nextLine();

        while (!orders.equals("Travel")) {

            String[] commands = orders.split(":");

            switch (commands[0]) {

                case "Add Stop":
                    int index = Integer.parseInt(commands[1]);
                    String str = commands[2];
                    if (0 <= index && index < travelStops.length()) {
                        travelStops.insert(index, str);

                    }
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);

                    if (travelStops.toString().length() > startIndex && startIndex >= 0 &&
                            endIndex < travelStops.toString().length() && endIndex >=0) {
                        travelStops.replace(startIndex, endIndex + 1, "");

                    }
                    break;
                case "Switch":
                    String oldString = commands[1];
                    String newString = commands[2];

                    travelStops = new StringBuilder(travelStops.toString().replace(oldString, newString));


                    break;
            }
            System.out.println(travelStops);
            orders = scanner.nextLine();
        }

            System.out.printf("Ready for world tour! Planned stops: %s", travelStops);
        }
        static  boolean isValidIndex(StringBuilder s, int index){
        return index>=0 && index < s.length();
        }
    }


