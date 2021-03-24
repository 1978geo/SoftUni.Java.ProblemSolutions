package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class L0407ListFiles {

    public static void main(String[] args) throws IOException {

        String fileName = "C:/Users/EMEAKO/Desktop/Java Advanced/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams";

        File file = new File(fileName);

        File [] innerFiles = file.listFiles();

        for (File innerFile : innerFiles) {
            if(!innerFile.isDirectory()){
                System.out.printf("%s: [%d]%n" , innerFile.getName(), innerFile.length());
            }
        }

    }
}
