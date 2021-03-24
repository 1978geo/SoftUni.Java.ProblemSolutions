package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class FinalExamPrep01TheImitationGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        while(!input.equals("Decode")){
            String [] token = input.split("\\|");
            String command = token[0];

            switch (command){
                case"Move":
                    int numberOfLetters = Integer.parseInt(token[1]);
                    if(numberOfLetters>=0 && numberOfLetters<=message.length()){
                        String first = message.substring(0, numberOfLetters);
                        String second = message.substring(numberOfLetters, message.length());
                        message = second+first;
                    }


                    break;
                case"Insert":
                    int index = Integer.parseInt(token[1]);
                    String givenValue = token[2];
                    if(index>=0 && index<=message.length()){
                        String first = message.substring(0, index);
                        String second = message.substring(index, message.length());
                        message = first+givenValue+second;
                    }

                    break;
                case"ChangeAll":
                    String substring = token[1];
                    String replacement = token[2];
                    sb = new StringBuilder(message);
                    if(message.contains(token[1])){
                        message =  message.replace(substring, replacement);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);

    }
}
