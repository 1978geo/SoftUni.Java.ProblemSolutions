package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class E0406WordCount {


    private static final String INPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt";
    private static final String INPUT_PATH2 = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt";
    private static final String OUTPUT_PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/results.txt";
    public static <writer> void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             BufferedReader reader2 = new BufferedReader(new FileReader(INPUT_PATH2));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String [] wordsText = reader.readLine().split("\\s+");
            String [] textText = reader2.readLine().split("\\s+");

            Set <String> wordsFromText = new HashSet<>();
            Map<String,Integer> newTextFile = new LinkedHashMap<>();
            wordsFromText.addAll(Arrays.asList(wordsText));
            for (int i = 0; i < textText.length; i++) {

                if(wordsFromText.contains(textText[i])){
                    newTextFile.putIfAbsent(textText[i], 0);
                    newTextFile.put(textText[i],newTextFile.get(textText[i])+1);
                }

            }
                    newTextFile.entrySet().
                            stream().sorted((w1,w2) -> w2.getValue().compareTo(w1.getValue()))
        .forEach((e) -> writer.printf("%s - %d%n", e.getKey(), e.getValue()));

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
