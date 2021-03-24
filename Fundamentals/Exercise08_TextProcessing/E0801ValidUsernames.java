package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0801ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] info = scanner.nextLine().split(", ");

        for (int i = 0; i < info.length; i++) {

            if (3 <= info[i].length() && info[i].length() <= 16) {
                String currentWord = info[i];
                int counter = 0;

                    for (int j = 0; j < currentWord.length(); j++) {
                        char currentDigit = currentWord.charAt(j);

                        if (Character.isLetter(currentDigit) || Character.isDigit(currentDigit) ||
                                currentWord.contains("_") || currentWord.contains("-")) {
                            counter++;
                        }
                        if (currentWord.length()==counter){
                            System.out.println(currentWord);
                        }
                    }
            }
        }
    }
}





