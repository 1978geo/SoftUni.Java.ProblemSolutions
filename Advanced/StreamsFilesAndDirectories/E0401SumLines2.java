package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E0401SumLines2 {

        private static final String PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {

                String line = reader.readLine();
                while (line != null) {
                    int sum = 0;
                    for (int i = 0; i < line.length(); i++) {
                        sum += line.charAt(i);
                    }

                    System.out.println(sum);
                    line = reader.readLine();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }


