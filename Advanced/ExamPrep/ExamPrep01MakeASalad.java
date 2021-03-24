package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class ExamPrep01MakeASalad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Queue
        ArrayDeque<String> veggie = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        // Stack
               ArrayDeque<Integer> calories = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(calories::push);
        List<Integer> saladsReady = new ArrayList<>();
        int currentCalories = 0;

        while(!veggie.isEmpty() && !calories.isEmpty()){
            String currentVeggie = veggie.poll();
            int currentVeggieCal = 0;

            if(currentVeggie.equals("tomato")){
                currentVeggieCal=80;
            } else if(currentVeggie.equals("potato")){
                    currentVeggieCal=215;
                } else if(currentVeggie.equals("carrot")){
                currentVeggieCal=136;
            }else if(currentVeggie.equals("lettuce")){
                currentVeggieCal=109;
            }

            int reservedCalories = calories.peek();

            if (reservedCalories==currentCalories){
                currentCalories = reservedCalories;
            }
            currentCalories = reservedCalories;
            if(reservedCalories-currentVeggieCal<=0){
                calories.pop();
                saladsReady.add(currentCalories);
            } else{
                calories.push(reservedCalories-currentVeggieCal);
            }

        }


    }
}
