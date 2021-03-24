package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinalExamPrep03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> townPopulation = new HashMap<>();
        Map<String, Integer> gold = new HashMap<>();


        while (!input.equals("Sail")) {

            String[] info = input.split("[|]+");

            townPopulation.put(info[0], Integer.parseInt(info[1]));
            gold.put(info[0], Integer.parseInt(info[2]));


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

                    if (townPopulation.containsKey(town)) {
                        int currentPopulation = townPopulation.get(town);
                        townPopulation.put(town, currentPopulation - killedPopulation);
                        int currentGold = gold.get(town);
                        gold.put(town, currentGold - stolenGold);
                    }
                    if (townPopulation.get(town) > 0 | gold.get(town) > 0) {

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                                town, stolenGold, killedPopulation);
                    } else {
                        System.out.println(town + " has been wiped off the map!");
                    }
                    break;
                case "Prosper":
                    town = moreInfo[1];
                    int addedGold = Integer.parseInt(moreInfo[2]);

                    if (addedGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        if (townPopulation.containsKey(town)) {

                            int currentGold = gold.get(town);
                            gold.put(town, currentGold + addedGold);

                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                    addedGold, town, gold.get(town));
                        }

                    }
                    break;

            }
            input = scanner.nextLine();
        }

        if(townPopulation.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            int settlements = townPopulation.size();
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", settlements);

            gold.entrySet().stream()
                    .sorted((a,b) -> b.getValue()-a.getValue())
                    .forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            entry.getKey(), townPopulation.entrySet(), entry.getValue()));

        }

    }
}

//Havana -> Population: 410000 citizens, Gold: 1100 kg