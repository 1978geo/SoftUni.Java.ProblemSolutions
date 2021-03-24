package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E0401SumLines {
    public static void main(String[] args) throws IOException {

        String fileName = "C:/Users/EMEAKO/Desktop/Java Advanced/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedReader reader = Files.newBufferedReader(Path.of(fileName));

        String line = reader.readLine();

        while (line!=null){

            long sum = 0;

            for (int i = 0; i < line.length(); i++) {

                sum += line.charAt(i);

            }

            System.out.println(sum);

            line = reader.readLine();
        }

    }
}
