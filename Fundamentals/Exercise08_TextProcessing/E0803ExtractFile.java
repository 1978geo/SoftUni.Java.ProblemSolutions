package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0803ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();


        int extend = filePath.lastIndexOf(".") + 1;
        String extension = filePath.substring(extend);
        int fileName = filePath.lastIndexOf("\\") + 1;
        String name = filePath.substring(fileName, extend - 1);

        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s", extension);
    }
}
