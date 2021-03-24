package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.*;

public class L0405WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));

        int lineNumber = 0;

        String line = reader.readLine();

        while (line!=null){

            lineNumber++;

            if(lineNumber%3==0){

                writer.write(line);
                writer.newLine();
            }

            line = reader.readLine();

        }

        writer.close();
    }
}
