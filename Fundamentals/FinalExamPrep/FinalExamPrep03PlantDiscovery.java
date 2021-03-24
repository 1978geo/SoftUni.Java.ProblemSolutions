package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.*;

public class FinalExamPrep03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> rarityInfo = new HashMap<>();
        Map<String, List<Double>> ratingInfo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("<->");
            String plant = info[0];
            int rarity = Integer.parseInt(info[1]);

            if (rarityInfo.containsKey(plant)) {
                rarityInfo.get(plant).set(0, rarity);
            }
            rarityInfo.put(plant, new ArrayList<>());
            rarityInfo.get(plant).add(0, rarity);
        }
        String info = scanner.nextLine();

        while (!info.equals("Exhibition")) {
            String[] commands = info.split("[-: ]+");

            switch (commands[0]) {

                case "Rate":
                    String plant = commands[1];
                    double rating = Double.parseDouble(commands[2]);

                    if (rarityInfo.containsKey(plant)) {

                        ratingInfo.putIfAbsent(plant, new ArrayList<>());
                        ratingInfo.get(plant).add(rating);

                    }
                    else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    plant = commands[1];
                    int newRarity = Integer.parseInt(commands[2]);
                    if (rarityInfo.containsKey(plant)) {
                        rarityInfo.get(plant).set(0, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    plant = commands[1];

                    if (rarityInfo.containsKey(plant)) {

                        ratingInfo.get(plant).set(0,0.0);

                    } else {
                        System.out.println("error");
                    }
                    break;
            }

            info = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition: ");

        rarityInfo.entrySet().stream()
                .sorted((a,b) -> {

                    if ( b.getValue() != a.getValue()) {
                        return Integer.compare(b.getValue().get(0),a.getValue().get(0));
                    }
                    else {
                        List<Double>aRatingList = ratingInfo.get(a.getKey());
                        List<Double>bRatingList = ratingInfo.get(b.getKey());
                        double aAverageRating = calculateAverage(aRatingList);
                        double bAverageRating = calculateAverage(bRatingList);
                        return Double.compare(bAverageRating,aAverageRating);
                    }
                })
                .map(e -> "- "+ e.getKey() + "; Rarity: " + e.getValue().get(0) + "; Rating: "
                        + String.format("%.2f%n", calculateAverage(ratingInfo.get(e.getKey()))))
                .forEach(System.out::print);
    }
    static double calculateAverage(List<Double> numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum/numbers.size();
    }
}
