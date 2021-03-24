package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E0306AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> taskInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")){
            int resource = Integer.parseInt(scanner.nextLine());

            if(taskInfo.containsKey(input)){
                taskInfo.put(input, taskInfo.get(input)+resource);
            }
            taskInfo.putIfAbsent(input, resource);


            input = scanner.nextLine();
        }

            taskInfo.forEach((k,v) ->System.out.printf("%s -> %d%n", k,v));
    }
}
