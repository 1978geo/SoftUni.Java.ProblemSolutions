package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class L0402WriteToFile {
    public static <cast> void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        PrintWriter writer = new PrintWriter(outputStream);

        Set<Character> punctuations = new HashSet<>();
        punctuations.add(',');
        punctuations.add('.');
        punctuations.add('!');
        punctuations.add('?');

        int singleByte = inputStream.read();
        while (singleByte >= 0) {

            char symbol = (char) singleByte;

            if (!punctuations.contains(symbol)) {
                writer.print(symbol);
            }

            singleByte = inputStream.read();

        }
        writer.close();

        inputStream.close();
    }
}
