package SoftUniJavaProblemSolutions.Fundamentals.Exercise09_RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E0902Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexName = "[A-Za-z]";
        Pattern namePattern = Pattern.compile(regexName);
        String regexRun = "\\d";
        Pattern runPattern = Pattern.compile(regexRun);
        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        Map<String, Integer> raceInfo = new LinkedHashMap<>();

        for (int i = 0; i < names.size(); i++) {
            String participant = names.get(i);
            raceInfo.put(participant, 0);
        }

        while (!input.equals("end of race")) {
            Matcher nameMatcher = namePattern.matcher(input);

            StringBuilder sbNames = new StringBuilder();

            while (nameMatcher.find()) {
                sbNames.append(nameMatcher.group().toString());
            }

            if (raceInfo.containsKey(sbNames.toString())) {
                int currentRun = raceInfo.get(sbNames.toString());
                Matcher matcherRun = runPattern.matcher(input);

                while (matcherRun.find()) {
                    currentRun += Integer.parseInt(matcherRun.group());

                }
                raceInfo.put(sbNames.toString(), currentRun);

            }

            input = scanner.nextLine();
        }
        List<String> winners = raceInfo.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int count = 1;
        for (String winner : winners) {
            switch (count++) {
                case 1:
                    System.out.println("1st place: " + winner);
                    break;
                case 2:
                    System.out.println("2nd place: " + winner);
                    break;
                case 3:
                    System.out.println("3rd place: " + winner);
                    break;
            }
        }
    }
}
