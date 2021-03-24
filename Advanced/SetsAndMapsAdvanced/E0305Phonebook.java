package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E0305Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contactInfo = scanner.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        while (!contactInfo.equals("search")) {
            String[] givenInfo = contactInfo.split("-");
            String name = givenInfo[0];
            String phoneNumber = givenInfo[1];

            phoneBook.putIfAbsent(name, phoneNumber);
            phoneBook.put(name, phoneNumber);

            contactInfo = scanner.nextLine();
        }

        contactInfo = scanner.nextLine();

        while (!contactInfo.equals("stop")) {

            if (phoneBook.containsKey(contactInfo)) {
                System.out.printf("%s -> %s%n", contactInfo, phoneBook.get(contactInfo));
            } else {
                System.out.printf("Contact %s does not exist.%n", contactInfo);
            }
            contactInfo = scanner.nextLine();
        }
    }
}
