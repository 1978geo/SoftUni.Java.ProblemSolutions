package SoftUniJavaProblemSolutions.Fundamentals.Exercise01_BasicSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E0109PadawanEquipment {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        double countOfStudents = Double.parseDouble(scanner.nextLine());
        ;
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double freeBelts = 0;
        if (countOfStudents > 5) {
            freeBelts = Math.floor(countOfStudents / 6);
        }
        double amountNeeded = lightsabersPrice * Math.ceil(countOfStudents * 1.1) + robesPrice * countOfStudents +
                beltsPrice * ((countOfStudents - freeBelts));


        if (amountOfMoney >= amountNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", Math.abs(amountNeeded));
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(amountOfMoney - amountNeeded));

        }

    }
}
//sabresPrice*(studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice*(studentsCount-freeBelts)
//1*(3) + 2*(2) + 3*(2) = 13.00

//The money is enough - it would cost {the cost of the equipment}lv.