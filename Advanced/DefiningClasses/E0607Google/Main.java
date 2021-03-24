package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0607Google;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Map<String, Person> personInfo = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        getPerson();

        String finalName= reader.readLine();

        if (personInfo.containsKey(finalName)) {
            System.out.println(personInfo.get(finalName));
        }
    }

    private static void getPerson() throws IOException{

        String input = reader.readLine();


        while (!input.equals("End")){
        String [] tokens = input.split("\\s+");
        String name = tokens[0];

        personInfo.putIfAbsent(name, new Person());
        Person person = personInfo.get(name);

            if (tokens.length==5){
//            companyName> <department> <salary>"
            String companyName = tokens[2];
            String department = tokens[3];
            double salary = Double.parseDouble(tokens[4]);


            personInfo.get(name).setCompany(new Company(companyName, department, salary));
        }
        else{
            switch (tokens[1]){
                case "pokemon" :
            String pokemonName = tokens[2];
            String pokemonType = tokens[3];
                    personInfo.get(name).add(new Pokemon(pokemonName, pokemonType));

                    break;
                case "parents" :
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];

                    personInfo.get(name).add(new ParentName(parentName,parentBirthday));
                    break;

                case "children" :
                    String childName = tokens[2];
                    String childBirthday = tokens[3];

                    personInfo.get(name).add(new Children(childName,childBirthday));
                    break;
                case "data" :
                    String carModel = tokens[2];
                    String carSpeed = tokens[3];

                    personInfo.get(name).setCar(new Car(carModel,carSpeed));
                    break;
                default:
                    System.out.println("wrong param");
                    break;

            }
        }
        input = reader.readLine();
        }
    }

}
