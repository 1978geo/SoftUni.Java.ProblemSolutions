package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E0105Robotics {
    private static Object Time;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotInfo = scanner.nextLine().split("[-;]");

        String startingTime = scanner.nextLine();

        String [] timeData = startingTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);

        int startTimeInSeconds = hours*3600 + minutes*60 + seconds;

        String inputProduct = scanner.nextLine();

        String [] robotNames = new String[robotInfo.length/2];
        int [] processTime = new int [robotInfo.length/2];

        for (int i = 0; i < robotInfo.length; i+=2) {

            String name  = robotInfo[i];
            int processingTime = Integer.parseInt(robotInfo[i+1]);
            robotNames [i/2] = name;
            processTime[i/2] = processingTime;

        }

        ArrayDeque <String> productsQueue = new ArrayDeque<>();


        while(!inputProduct.equals("End")){

            productsQueue.offer(inputProduct);
            System.out.printf("%s - %s - %n", robotNames[0], inputProduct);

            inputProduct = scanner.nextLine();
        }


    }
}
