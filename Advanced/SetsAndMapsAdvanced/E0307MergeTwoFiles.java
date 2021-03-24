package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E0307MergeTwoFiles {



    private static final String INPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt";
    private static final String INPUT_PATH2 = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt";
    private static final String OUTPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/mergedOutput.txt";
    public static <writer> void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             BufferedReader reader2 = new BufferedReader(new FileReader(INPUT_PATH2));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String textOne = reader.readLine();
            String textTwo = reader2.readLine();

            while (textOne!=null){
                writer.println(textOne);
                textOne = reader.readLine();
            }

            while (textTwo!=null){
                writer.println(textTwo);
                textTwo = reader2.readLine();
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
