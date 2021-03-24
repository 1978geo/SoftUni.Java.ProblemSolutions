package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab06_NestedLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsInput = Integer.parseInt(scanner.nextLine());
        int roomsInput = Integer.parseInt(scanner.nextLine());

        for (int floor = floorsInput; floor >= 1; floor--) {
            for (int room = 0; room < roomsInput; room++) {

                if (floor == floorsInput){
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0){
                    System.out.printf("O%d%d ", floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
