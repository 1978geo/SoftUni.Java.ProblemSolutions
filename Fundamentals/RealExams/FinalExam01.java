package SoftUniJavaProblemSolutions.Fundamentals.RealExams;

import java.util.Scanner;

public class FinalExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Sign up")){
            String [] commands = input.split("\\s+");
            switch (commands[0]){

                case"Case":
                    if(commands[1].equals("lower")){
                    username = username.toLowerCase();

                    }
                    if(commands[1].equals("upper")){
                      username = username.toUpperCase();
                    }
                    System.out.println(username);
                    break;
                case"Reverse":

                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);

                    if(startIndex>=0 && startIndex<=username.length()&&endIndex>=0 && endIndex<=username.length()){
                        String substring = username.substring(startIndex, endIndex+1);
                        StringBuilder sb = new StringBuilder(substring);
                        String reversedString = sb.reverse().toString();
                        System.out.println(reversedString);
                    }

                    break;
                case"Cut":
                    String substring = commands[1];

                    if(username.contains(substring)){
                    username = username.replace(substring, "");
                    System.out.println(username);
                    }
                    else{
                        System.out.printf("The word %s doesn't contain %s.%n", username, substring);
                    }
                    break;
                case"Replace":
                    String givenChar = commands[1];
                    if(username.contains(givenChar)){
                        username  = username.replace(givenChar, "*");
                    }
                    System.out.println(username);
                    break;
                case"Check":
                    givenChar = commands[1];
                    if(username.contains(givenChar)){
                    System.out.println("Valid");
                    }
                    else{
                    System.out.printf("Your username must contain %s.%n", givenChar);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;

            }


            input = scanner.nextLine();
        }



    }
}
