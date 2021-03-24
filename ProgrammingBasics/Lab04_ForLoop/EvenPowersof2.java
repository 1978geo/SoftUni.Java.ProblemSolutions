package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab04_ForLoop;

import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 0; i <= n; i += +2) {
            result = (int) Math.pow(2, i);
            System.out.println(result);
        }
    }
}
