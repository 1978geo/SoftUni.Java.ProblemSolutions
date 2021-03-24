package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class ExamPrep01SantasPresentFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Stack
        ArrayDeque<Integer> material = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(material::push);
        // Queue
        ArrayDeque<Integer> magicLevel = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        Map<String, Integer> presentsCollection = new TreeMap<>();

        while(!magicLevel.isEmpty() && !material.isEmpty()){

            int currentMaterial = material.pop();
            int currentLevel = magicLevel.poll();

            if(currentMaterial==0){
                if(!material.isEmpty()) {
                    currentMaterial = material.pop();
                } else{
                    break;
                }
            }
            if(currentLevel==0){
                if(!magicLevel.isEmpty()){
                    currentLevel = magicLevel.poll();
                } else{
                    break;
                }
            }


            if(currentLevel*currentMaterial<0){
                material.push(currentLevel+currentMaterial);
            } else if( currentLevel*currentMaterial==150){
                String name = "Doll";
                int value = 1;
                addPresent(presentsCollection, name, value);

            }else if( currentLevel*currentMaterial==250){
                String name = "Wooden train";
                int value = 1;
                addPresent(presentsCollection, name, value);
            }else if( currentLevel*currentMaterial==300){
                String name = "Teddy bear";
                int value = 1;
                addPresent(presentsCollection, name, value);
            }else if( currentLevel*currentMaterial==400){
                String name = "Bicycle";
                int value = 1;
                addPresent(presentsCollection, name, value);
            }
            else {
                material.push(currentMaterial+15);
            }
        }

        if(presentsCollection.get("Doll")!=null && presentsCollection.get("Wooden train") !=null&&
                presentsCollection.get("Doll")> 0 && presentsCollection.get("Wooden train")>0){
            System.out.println("The presents are crafted! Merry Christmas!");
        }
        else if(presentsCollection.get("Teddy bear")!=null && presentsCollection.get("Bicycle")!=null &&
                presentsCollection.get("Teddy bear")> 0&& presentsCollection.get("Bicycle")>0){
            System.out.println("The presents are crafted! Merry Christmas!");
        }else{
            System.out.println("No presents this Christmas!");
        }

        if(!material.isEmpty()){
            StringBuilder sb = new StringBuilder();
            sb.append("Materials left: ").
                    append(material.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")));
            System.out.println(sb.toString().trim());

        }
        if(!magicLevel.isEmpty()){
            StringBuilder sb = new StringBuilder();
            sb.append("Magic left: ").
                    append(magicLevel.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")));
            System.out.println(sb.toString().trim());
        }
        if(!presentsCollection.isEmpty()){
            presentsCollection.entrySet().stream()
                    .forEach((k) -> System.out.printf("%s: %d%n",k.getKey(),k.getValue()));
        }

    }

    public static void addPresent(Map<String, Integer> presentsCollection, String name, int value) {

        presentsCollection.putIfAbsent(name, 0);
        if (presentsCollection.get(name)!=null){
            presentsCollection.put(name, presentsCollection.get(name)+1);
        }

    }
}
