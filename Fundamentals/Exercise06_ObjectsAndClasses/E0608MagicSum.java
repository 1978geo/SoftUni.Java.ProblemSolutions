package SoftUniJavaProblemSolutions.Fundamentals.Exercise06_ObjectsAndClasses;

import java.util.Arrays;
import java.util.Scanner;

public class E0608MagicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] items = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        int givenNumber = Integer.parseInt(scanner.nextLine());

        int digitOne = 0;
        int digitTwo = 0;

        for (int i = 0; i < items.length; i++) {
            digitOne = items[i];
            for (int j = i+1; j < items.length ; j++) {

                    digitTwo = items[j];
                    if(digitOne+digitTwo == givenNumber){
                        System.out.println(digitOne + " " + digitTwo);
                    }
            }
        }
    }
}
