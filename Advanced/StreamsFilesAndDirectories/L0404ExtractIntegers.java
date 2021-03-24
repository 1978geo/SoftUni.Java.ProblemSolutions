package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L0404ExtractIntegers {
    public static <cast> void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("input.txt");

        Scanner scanner = new Scanner(inputStream);

        FileWriter out = new FileWriter("out.txt");

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                out.write(String.valueOf(number));
                out.write(System.lineSeparator());

            }
            scanner.next();
        }

        out.flush();
        out.close();

    }

}
