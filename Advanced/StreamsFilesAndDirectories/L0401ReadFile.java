package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class L0401ReadFile {
    public static <cast> void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int oneByte = inputStream.read();

        while (oneByte >= 0) {

                System.out.print(Integer.toBinaryString(oneByte) + " ");

            oneByte = inputStream.read();

        }

        inputStream.close();
    }
}
