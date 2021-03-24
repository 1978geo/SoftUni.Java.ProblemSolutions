package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0802CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");

        String firstWord = info[0];
        String secondWord = info[1];
//
//        int charSum  = 0;

        System.out.println(charMultiplication(firstWord, secondWord));

//        if (firstWord.length()<=secondWord.length()){
//            for (int i = 0; i < firstWord.length(); i++) {
//                int multiplication = firstWord.charAt(i)*secondWord.charAt(i);
//                charSum+=multiplication;
//            }
//            for (int i = firstWord.length(); i < secondWord.length() ; i++) {
//                int charAdding = secondWord.charAt(i);
//                charSum+=charAdding;
//            }
//        }
//
//        else {
//            for (int i = 0; i < secondWord.length(); i++) {
//                int multiplication = firstWord.charAt(i)*secondWord.charAt(i);
//                charSum+=multiplication;
//            }
//
//            for (int i = secondWord.length(); i < firstWord.length() ; i++) {
//                int charAdding = firstWord.charAt(i);
//                charSum+=charAdding;
//            }
//
//        }
//                System.out.println(charSum);
    }
            private static Integer charMultiplication (String firstWord, String secondWord){

                int charSum  = 0;

                if (firstWord.length()<=secondWord.length()){
                    for (int i = 0; i < firstWord.length(); i++) {
                        int multiplication = firstWord.charAt(i)*secondWord.charAt(i);
                        charSum+=multiplication;
                    }
                    for (int i = firstWord.length(); i < secondWord.length() ; i++) {
                        int charAdding = secondWord.charAt(i);
                        charSum+=charAdding;
                    }
                }

                else {
                    for (int i = 0; i < secondWord.length(); i++) {
                        int multiplication = firstWord.charAt(i)*secondWord.charAt(i);
                        charSum+=multiplication;
                    }

                    for (int i = secondWord.length(); i < firstWord.length() ; i++) {
                        int charAdding = firstWord.charAt(i);
                        charSum+=charAdding;
                    }

                }
                    return charSum;
            }
}
