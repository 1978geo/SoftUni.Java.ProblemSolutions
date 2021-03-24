package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E0404CountCharacterTypes {
    private static final String INPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
    private static final String OUTPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt";

    public static <writer> void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String line = reader.readLine();
            int vowels = 0;
            int punctuations = 0;
            int consonants = 0;
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    if (currentChar == 'a' | currentChar == 'e' | currentChar == 'i' |
                            currentChar == 'o' | currentChar == 'u') {
                        vowels++;
                    } else if (currentChar == '!' | currentChar == ',' | currentChar == '.' | currentChar == '?') {
                        punctuations++;
                    }
                    else if (currentChar != ' ') {
                        consonants++;
                    }
                }

                line = reader.readLine();
                }

            writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowels, consonants,punctuations);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
