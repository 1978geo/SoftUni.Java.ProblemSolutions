package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0803TreasureFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("find")) {
            sb.setLength(0);
            String[] info = input.split("");

            for (int i = 0; i < info.length; i++) {
                String currentStr = info[i];
                int currentKey = key[i % key.length];
                char start = (char) (currentStr.charAt(0) - currentKey);
                sb.append(start);
            }

            int nameStart = sb.indexOf("&");
            int endName = sb.lastIndexOf("&");
            String treasure = sb.substring(nameStart + 1, endName);

            int coordinateStart = sb.indexOf("<");
            int coordinateEnd = sb.lastIndexOf(">");

            String coordinates = sb.substring(coordinateStart + 1, coordinateEnd);

            System.out.printf("Found %s at %s%n", treasure, coordinates);

            input = scanner.nextLine();
        }

    }
}
