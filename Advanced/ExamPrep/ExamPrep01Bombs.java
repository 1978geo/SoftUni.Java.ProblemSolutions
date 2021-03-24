package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ExamPrep01Bombs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Queue
        ArrayDeque<Integer> bombEffects = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

    // Stack
        ArrayDeque<Integer> bombCasings = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(bombCasings::push);

        boolean isCompletedBombPouch = false;

        TreeMap<String,Integer> bombCounter = new TreeMap<>();
        bombCounter.put("Cherry Bombs", 0);
        bombCounter.put("Datura Bombs", 0);
        bombCounter.put("Smoke Decoy Bombs", 0);

        while(!bombEffects.isEmpty() && !bombCasings.isEmpty()){

            if(hasAllBombs(bombCounter)){
                break;
            }

            int currentEffect = bombEffects.peek();
            int currentCasings = bombCasings.pop();
            int currentSum = currentEffect+currentCasings;

            if(currentSum==40){
                bombCounter.put("Datura Bombs",bombCounter.get("Datura Bombs")+1);
                bombEffects.poll();
            }
            else if(currentSum==60){
                bombCounter.put("Cherry Bombs", bombCounter.get("Cherry Bombs")+1);
                bombEffects.poll();
            }
            else if (currentSum==120){
                bombCounter.put("Smoke Decoy Bombs", bombCounter.get("Smoke Decoy Bombs")+1);
                bombEffects.poll();
            }
            else{
                bombCasings.push(currentCasings-5);
            }
        }

        if (hasAllBombs(bombCounter)) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");

        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        String effectsOutput = "Bomb Effects: "
                + (bombEffects.isEmpty() ? "empty" :
                bombEffects.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")));

        System.out.println(effectsOutput);

        String casingsOutput = "Bomb Casings: "
                + (bombCasings.isEmpty() ? "empty" :
                bombCasings.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")));

        System.out.println(casingsOutput);


        bombCounter.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));


    }
    private static boolean hasAllBombs(TreeMap<String, Integer> bombCounter) {
        return bombCounter.get("Cherry Bombs") >= 3
                && bombCounter.get("Datura Bombs") >= 3
                && bombCounter.get("Smoke Decoy Bombs") >= 3;
    }
}


// if(bombEffects.isEmpty()){
//         System.out.println("Bomb Effects: empty");
//         } else{
//         System.out.print("Bomb Effects: ");
//         for (int i = 0; i <= bombEffects.size(); i++) {
//         StringJoiner("%d",bombEffects.poll(), ", ");
//         StringJoiner joiner = new StringJoiner(", ");
//         joiner.add(bombEffects.poll());
//         }
//         System.out.println();
//         }
//
//         if(bombCasings.isEmpty()){
//         System.out.println("Bomb Casings: empty");
//         } else{
//         System.out.print("Bomb Casings:");
//         for (int i = 0; i <= bombCasings.size(); i++) {
//         System.out.print(" " + bombCasings.pop());
//         }
//         System.out.println();
//         }