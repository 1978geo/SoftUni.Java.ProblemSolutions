package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0605CarSalesman;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineData = new HashMap<>();
        Engine engine=null;

        for (int i = 0; i < n; i++) {

            String [] tokens = scanner.nextLine().split("\\s+");
            String engineModel = tokens[0];
            String power = tokens[1];

            if(tokens.length==4){
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                engine = new Engine(engineModel, power, displacement, efficiency);

            }
            else if (tokens.length==2){
                engine = new Engine(engineModel,power);

            } else if(tokens.length==3){
                if(tokens[2].matches("^\\d+$")){
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(engineModel,power,displacement);

                } else{
                    String efficiency = tokens[2];
                    engine = new Engine(engineModel, power, efficiency);
                }
            }
            engineData.putIfAbsent(engineModel,engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> carData = new ArrayList<>();

        Car car = null;
        for (int i = 0; i < m; i++) {
//A Car has a model, engine, weight and color
            String [] tokens2 = scanner.nextLine().split("\\s+");
            String carModel = tokens2[0];
            engine = engineData.get(tokens2[1]);

            if(tokens2.length==4){
                int weight = Integer.parseInt(tokens2[2]);
                String color = tokens2[3];
                car = new Car(carModel, engine, weight, color);
            }
            else if (tokens2.length==2){
                car = new Car(carModel, engine);

            } else if(tokens2.length==3){
                if(tokens2[2].matches("^\\d+$")){
                    int weight = Integer.parseInt(tokens2[2]);
                    car = new Car(carModel, engine, weight);
                } else{
                    String color = tokens2[2];
                    car = new Car(carModel, engine, color);
                }
            }
            carData.add(car);
        }
        carData.forEach(e->System.out.println(e));

    }
}

