package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0406CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int area = getRectangularArea(width, length);
        System.out.print(area);

    }
    static int getRectangularArea(int width, int length){
        return (width*length);
    }
}
