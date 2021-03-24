package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.*;

public class FinalExamPrep03Pirates2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<Integer>> townGoldPopulation = new TreeMap<>();
        List<Integer> goldPopulationInfo = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {

            String[] info = input.split("[|]+");
            String townName = info[0];
            int population = Integer.parseInt(info[1]);
            int currentGold = Integer.parseInt(info[2]);

            if (!townGoldPopulation.containsKey(townName)) {
                townGoldPopulation.put(townName, new ArrayList<>());
                townGoldPopulation.get(townName).add(0, population);
                townGoldPopulation.get(townName).add(1, currentGold);
            } else {
                int currentPopulation = townGoldPopulation.get(townName).get(0);
                townGoldPopulation.get(townName).set(0, currentPopulation + population);
                int gold = townGoldPopulation.get(townName).get(1);
                townGoldPopulation.get(townName).set(1, gold + currentGold);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] moreInfo = input.split("=>");

            String command = moreInfo[0];

            switch (command) {
                case "Plunder":
                    String town = moreInfo[1];
                    int killedPopulation = Integer.parseInt(moreInfo[2]);
                    int stolenGold = Integer.parseInt(moreInfo[3]);

                    if (townGoldPopulation.containsKey(town)) {
                        int currentPopulation = townGoldPopulation.get(town).get(0);
                        townGoldPopulation.get(town).set(0, currentPopulation - killedPopulation);
                        int gold = townGoldPopulation.get(town).get(1);
                        townGoldPopulation.get(town).set(1, gold - stolenGold);

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                                town, stolenGold, killedPopulation);

                        if (townGoldPopulation.get(town).get(0) == 0
                                || townGoldPopulation.get(town).get(1) == 0) {

                            System.out.println(town + " has been wiped off the map!");
                            townGoldPopulation.remove(town);
                        }
                    }
                    break;
                case "Prosper":
                    town = moreInfo[1];
                    int addedGold = Integer.parseInt(moreInfo[2]);
                    if (addedGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        if (townGoldPopulation.containsKey(town)) {

                            int currentGold = townGoldPopulation.get(town).get(1);
                            townGoldPopulation.get(town).set(1, currentGold + addedGold);

                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                    addedGold, town, townGoldPopulation.get(town).get(1));
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        if (townGoldPopulation.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            int settlements = townGoldPopulation.size();
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", settlements);

            townGoldPopulation.entrySet().stream()
                    .sorted((a, b) -> {
                        return Integer.compare(b.getValue().get(1), a.getValue().get(1));
                    })
                    .forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            e.getKey(), e.getValue().get(0), e.getValue().get(1)));
        }
    }
}

//Havana -> Population: 410000 citizens, Gold: 1100 kg
// studentInfo.entrySet().stream().
//         filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
//         .sorted((f,s) ->  {
//         double firstAv = f.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//         double secondAv = s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//         return Double.compare(secondAv, firstAv);
//
//         }).forEach(s -> {
//         System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue().stream().
//         mapToDouble(Double::doubleValue).average().getAsDouble());
//         });