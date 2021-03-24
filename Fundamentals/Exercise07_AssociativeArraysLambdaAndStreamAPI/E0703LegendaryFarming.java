package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E0703LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {

            String[] info = scanner.nextLine().split(" ");

            for (int i = 0; i < info.length; i += 2) {
                int quantity = Integer.parseInt(info[i]);
                String material = info[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    keyMaterials.put(material, (keyMaterials.get(material) + quantity));
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }

                } else {
                    junk.putIfAbsent(material, 0);
                    int currentJunk = junk.get(material);
                    junk.put(material, currentJunk + quantity);
                }
            }
        }
        keyMaterials.entrySet()
                .stream()
                .sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junk.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
