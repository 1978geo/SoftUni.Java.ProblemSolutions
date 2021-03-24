package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0210PokeMon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distancePokeTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactoryY = Integer.parseInt(scanner.nextLine());

        int pokeCount = 0;
        int finalPokePower = 0;

        for (int i = pokePowerN; i >= (pokePowerN - distancePokeTargetsM); i -= distancePokeTargetsM) {
            pokeCount++;
            finalPokePower = i - distancePokeTargetsM;

            if (finalPokePower == pokePowerN/2) {
                finalPokePower = finalPokePower / exhaustionFactoryY;
                break;
            }
            if((finalPokePower-distancePokeTargetsM)<0) {
                break;
            }
        }
        System.out.printf("%d%n", finalPokePower);
        System.out.printf("%d", pokeCount);
    }

}
