package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L0301ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> hash = new LinkedHashSet<>();
        String info = scanner.nextLine();

        while (!info.equals("END")){

            String [] input = info.split(", ");

            String direction= input[0];
            String carNumber = input[1];

            if(direction.equals("IN")){
                hash.add(carNumber);
            } else{
                hash.remove(carNumber);
            }

            info = scanner.nextLine();
        }
        if(!hash.isEmpty()){
            hash.forEach(System.out::println);
        }
            else{
             System.out.println("Parking Lot is Empty");
        }
    }
}

