package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.*;

public class FinalExamPrep03PlantDiscovery2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String , int[] > rarityInfo = new HashMap<>();
        int [] dataRarity = new int []{};
        Map<String, List<Double>> ratingInfo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("<->");
            String plant = info[0];
            int rarity = Integer.parseInt(info[1]);
            dataRarity = new int[]{rarity};

            if (!rarityInfo.containsKey(plant)) {
                rarityInfo.put(plant, dataRarity);
                ratingInfo.put(plant, new ArrayList<>());
            }
            else {
                rarityInfo.get(plant)[0]=rarity;
            }

        }
        String info = scanner.nextLine();

        while (!info.equals("Exhibition")) {
            String[] commands = info.split("[-: ]+");

            switch (commands[0]) {

                case "Rate":
                    String plant = commands[1];
                    double rating = Double.parseDouble(commands[2]);
                    List<Double>ratings = ratingInfo.get(plant);
                    if (ratings!=null) {

                        ratings.add(rating);
                    }
                    else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    plant = commands[1];
                    int newRarity = Integer.parseInt(commands[2]);
                    if (rarityInfo.containsKey(plant)) {
                        rarityInfo.get(plant)[0] = newRarity;
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    plant = commands[1];
                    List<Double>resetRatings = ratingInfo.get(plant);
                    if (resetRatings != null) {
                    resetRatings.clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }

            info = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        rarityInfo.entrySet().stream()
                .sorted((a,b) -> {

                    if ( b.getValue()[0] != a.getValue()[0]) {
                        return Integer.compare(b.getValue()[0],a.getValue()[0]);
                    }
                    else {
                        List<Double>aRatingList = ratingInfo.get(a.getKey());
                        List<Double>bRatingList = ratingInfo.get(b.getKey());
                        double aAverageRating = calculateAverage(aRatingList);
                        double bAverageRating = calculateAverage(bRatingList);
                        return Double.compare(bAverageRating,aAverageRating);
                    }
                })
                .map(e -> "- "+ e.getKey() + "; Rarity: " + e.getValue()[0] + "; Rating: "
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

