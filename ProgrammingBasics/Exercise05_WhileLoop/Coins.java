package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise05_WhileLoop;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double centChange = Math.floor(change*100);

        int coinsCounter = 0;

        while(change!=0){
            if (centChange>=200){
                coinsCounter++;
                centChange-=200;
            }
            else if(centChange>=100){
                coinsCounter++;
                centChange-=100;
            }
            else if(centChange>=50){
                coinsCounter++;
                centChange-=50;
            }
            else if(centChange>=20){
                coinsCounter++;
                centChange-=20;
            }
            else if(centChange>=10){
                coinsCounter++;
                centChange-=10;
            }
            else if(centChange>=5){
                coinsCounter++;
                centChange-=5;
            }
            else if(centChange>=2){
                coinsCounter++;
                centChange-=2;
            }
            else if(centChange>=1){
                coinsCounter++;
                centChange-=1;
            }
            coinsCounter++;
        }
        System.out.printf("%d",coinsCounter);
    }
}
