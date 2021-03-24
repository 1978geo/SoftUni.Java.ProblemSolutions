package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E0307FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailList = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!name.equals("stop")){

            String email = scanner.nextLine();

            String regex = ".([com|uk|us])+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);

            if (!matcher.find()){
                emailList.putIfAbsent(name, email);
            }
            name = scanner.nextLine();
        }
            emailList.entrySet()
                    .forEach((e) -> System.out.printf("%s -> %s%n", e.getKey(), e.getValue()));
    }
}
