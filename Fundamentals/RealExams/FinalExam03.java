package SoftUniJavaProblemSolutions.Fundamentals.RealExams;

import java.util.*;

public class FinalExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> mealCollection= new TreeMap<>();
        List<String> likedMeals = new ArrayList<>();
        int dislikedMeals = 0;
        while (!input.equals("Stop")){
            String [] command = input.split("-");
            String guest = command[1];
            String meal = command[2];

            switch (command[0]){

                case"Like":
                    mealCollection.putIfAbsent(guest, new ArrayList<>());
                       if(!mealCollection.get(guest).contains(meal)){
                           mealCollection.get(guest).add(meal);
                       }
                    break;
                case"Unlike":
                    if(mealCollection.containsKey(guest)){
                    if(mealCollection.get(guest).contains(meal)){
                        dislikedMeals++;
                        mealCollection.get(guest).remove(meal);

                        System.out.printf("%s doesn't like the %s.%n", guest, meal);
                    }
                    else{
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                    }
                    }
                    else {
                        System.out.println(guest + " is not at the party.");
                    }

                    break;
            }

            input = scanner.nextLine();
        }
mealCollection.entrySet().stream()
        .sorted((a,b) ->  b.getValue().size() - a.getValue().size())
        .map(e -> e.getKey() + ": " + String.join(", ", mealCollection.get(e.getKey())))
        .forEach(System.out::println);

        System.out.printf("Unliked meals: %d", dislikedMeals);
    }
}
//       mealCollection.entrySet().stream()
//               .sorted((a,b) ->  b.getValue().size() - a.getValue().size())
//               .forEach(e -> {
//               if(e.getValue().size()==0){
//               System.out.println(e.getKey() + ": ");
//               } else {
//               System.out.println(e.getKey() + ": " + String.join(", ", mealCollection.get(e.getKey())));
//               }
//
//               });