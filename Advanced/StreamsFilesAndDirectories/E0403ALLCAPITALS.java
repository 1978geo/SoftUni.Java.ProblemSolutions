package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E0403ALLCAPITALS {

    private static final String INPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
    private static final String OUTPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt";
    public static <writer> void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String line = reader.readLine();

            while (line != null) {
              writer.println(line.toUpperCase());

                line = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}