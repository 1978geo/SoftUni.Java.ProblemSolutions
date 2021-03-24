package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E0705SoftUniParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean registered = false;
        Map<String, String> parkingRegistrations = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String command = info[0];
            String username = info[1];

            switch (command) {
                case "register":
                    String licensePlate = info[2];
                    if (!parkingRegistrations.containsKey(username)) {
                        parkingRegistrations.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully%n", username, licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingRegistrations.get(username));
                    }
                    break;
                case "unregister":
                    if (!parkingRegistrations.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        parkingRegistrations.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        parkingRegistrations.entrySet()
                .forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));
    }
}
