package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExamPrep02MirrorWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([#|@])+(?<validWords>([A-Za-z]{3,}))\\1\\1(?<validWords2>([A-Za-z]{3,}))\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();
        int pairsCounter = 0;
        int mirrorWordsCounter = 0;
        List<String> pairsList = new ArrayList<>();

        while (matcher.find()){
            pairsCounter++;
            String validTwo = matcher.group(5);
            sb = new StringBuilder(validTwo).reverse();
            String validSB = sb.toString();

            if(matcher.group(2).equals(validSB)){
                mirrorWordsCounter ++;

                pairsList.add(matcher.group(2));
                pairsList.add(matcher.group(5));
            }
        }

        if(pairsCounter == 0) {
            System.out.println("No word pairs found!");
        }
        else {
            System.out.println(pairsCounter + " word pairs found!");
        }
        if(mirrorWordsCounter ==0){
            System.out.println("No mirror words!");
        }
        else
        {
        System.out.println("The mirror words are:");

            System.out.print(pairsList.get(0) +" <=> "+ pairsList.get(1));
            for (int i = 2; i < pairsList.size(); i+=2) {
                System.out.print(", " + pairsList.get(i) +" <=> "+ pairsList.get(i+1));
            }

        }
    }
}
