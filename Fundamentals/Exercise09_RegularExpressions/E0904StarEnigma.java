package SoftUniJavaProblemSolutions.Fundamentals.Exercise09_RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E0904StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String starRegex = "(?i)[star]";
        Pattern starPattern = Pattern.compile(starRegex);

        String regex = "@(?<planetName>[A-Z][a-z]+)[^@,!:>-]*:(?<population>\\d+)[^@,!:>-]*!(?<type>[A|D])![^@,!:>-]*->(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        int attackedPlanetsCounter = 0;
        int destroyedPlanetsCounter = 0;

        for (int i = 0; i < n; i++) {

            String info = scanner.nextLine();
            int counter = 0;
            Matcher matcher = starPattern.matcher(starRegex);
//
//            while (matcher.find()){
//                counter++;
//            }
            for (int j = 0; j < info.length(); j++) {
                if (info.charAt(j) == 'S' | info.charAt(j) == 'T' | info.charAt(j) == 'A' | info.charAt(j) == 'R' |
                        info.charAt(j) == 's' | info.charAt(j) == 't' | info.charAt(j) == 'a' | info.charAt(j) == 'r') {
                    counter++;
                }
            }
            StringBuilder sbNewCode = new StringBuilder();
//            if (counter > 0) {
                for (int k = 0; k < info.length(); k++) {
                    char newChar = (char) (info.charAt(k) - counter);
                    sbNewCode.append(newChar);
//                }
            }

            matcher = pattern.matcher(sbNewCode);

            while (matcher.find()) {
                if (matcher.group("type").equals("A")) {
                    attackedPlanetsCounter++;
                    attackedPlanets.add(matcher.group("planetName"));
                } else {
                    destroyedPlanetsCounter++;
                    destroyedPlanets.add(matcher.group("planetName"));
                }
            }
        }
            System.out.printf("Attacked planets: %d%n", attackedPlanetsCounter);
            Collections.sort(attackedPlanets);
            for (String attackedPlanet : attackedPlanets) {
                System.out.printf("-> %s%n", attackedPlanet);

        }
            System.out.printf("Destroyed planets: %d%n", destroyedPlanetsCounter);
            Collections.sort(destroyedPlanets);
            for (String destroyedPlanet : destroyedPlanets) {
                System.out.printf("-> %s%n", destroyedPlanet);
            }
        }
    }



