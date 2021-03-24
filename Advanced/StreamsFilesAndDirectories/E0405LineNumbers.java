package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E0405LineNumbers {


    private static final String INPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";
    private static final String OUTPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt";
    public static <writer> void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String line = reader.readLine();

            int numberCount = 0;
            while (line != null) {
                numberCount++;
                writer.println(numberCount + ". " + line);

                line = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
