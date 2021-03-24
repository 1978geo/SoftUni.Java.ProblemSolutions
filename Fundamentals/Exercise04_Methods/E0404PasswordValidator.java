package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0404PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passInput = scanner.nextLine();

        boolean charCheck = correctNumberOfChars(passInput);
        boolean letterAndDigitCheck = presenceOfLettersAndDigits(passInput);
        boolean twoDigitsCheck = atLeastTwoDigits(passInput);

        if (charCheck && letterAndDigitCheck && twoDigitsCheck) {
            System.out.println("Password is valid");
        }
    }

    static boolean correctNumberOfChars(String passInput) {
        if (passInput.length() < 6 || passInput.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    static boolean presenceOfLettersAndDigits(String passInput) {
        for (int i = 0; i < passInput.length(); i++) {
            char ch = passInput.charAt(i);
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    static boolean atLeastTwoDigits(String passInput) {
        int passDigits = 0;
        for (int i = 0; i < passInput.length(); i++) {
            char ch = passInput.charAt(i);
            if (Character.isDigit(ch)) {
                passDigits++;
            }
        }
        if (passDigits < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}


//
//•	"Password must be between 6 and 10 characters";
//•	"Password must consist only of letters and digits";
//•	"Password must have at least 2 digits".