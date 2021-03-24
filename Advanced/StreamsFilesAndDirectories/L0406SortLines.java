package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class L0406SortLines {
    public static void main(String[] args) throws IOException {

        String fileName = "input.txt";

        List<String> lines = Files.readAllLines(Path.of(fileName));

        FileWriter writer = new FileWriter("out.txt");

        Collections.sort(lines);

        for (int i = 0; i < lines.size(); i++) {

            writer.write(lines.get(i));
            writer.write(System.lineSeparator());

        }
        writer.close();
    }
}
