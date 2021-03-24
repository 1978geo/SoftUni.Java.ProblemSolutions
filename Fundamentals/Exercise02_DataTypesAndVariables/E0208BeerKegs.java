package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0208BeerKegs {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggerKegModel = "";
        for (int i = 0; i < n; i++) {

            String currentKegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentKegVolume = (int)(Math.PI*Math.pow(radius,2)*height);

            if (currentKegVolume>maxVolume){
                maxVolume = currentKegVolume;
                biggerKegModel = currentKegModel;

            }
        }
                System.out.println(biggerKegModel);
    }
}
