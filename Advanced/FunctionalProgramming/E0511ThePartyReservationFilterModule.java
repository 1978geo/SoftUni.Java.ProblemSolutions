package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E0511ThePartyReservationFilterModule {

    static List<String> names = null;
    private static HashSet<Object> removedNames;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        Set<String>removedNames2 = new HashSet<>();

        String command = scanner.nextLine();

        while (!command.equals("Print")) {

            String[] tokens = command.split(";");

            switch (tokens[0]) {

                case "Add filter":
                    removeName(getPredicate(tokens));
                    break;

                case "Remove filter":
                    addOneMoreName(getPredicate(tokens));
                    break;
            }

            command = scanner.nextLine();
        }
        if (!names.isEmpty()) {
            names.forEach(e -> System.out.print(e + " "));
        }
    }

    public static void removeName(Predicate<String> predicate) {
        removedNames = new HashSet<>();
        names.removeIf(predicate);
        names.stream().filter(predicate).forEach(e -> removedNames.add(e));
    }

    public static void addOneMoreName(Predicate<String> predicate) {
        List<String> namesToAdd = new ArrayList<>();
        names.stream().filter(predicate).forEach(namesToAdd::add);
        names.addAll(namesToAdd);
//        removedNames.stream().filter(predicate).forEach(names::add);

    }

    public static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;
        if (tokens[1].equals("Starts with")) {
            predicate = name -> name.startsWith(tokens[2]);
        } else if (tokens[1].equals("Ends with")) {
            predicate = name -> name.endsWith(tokens[2]);
        } else if (tokens[1].equals("Length")) {
            predicate = name -> name.length() == Integer.parseInt(tokens[2]);
        } else {
            predicate = name -> name.contains(tokens[2]);
        }

        return predicate;
    }

}
