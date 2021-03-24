package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.File;

public class E0408GetFolderSize {
    private static final String INPUT_PATH = ("C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");

    public static void main(String[] args) {
            File file = new File (INPUT_PATH);

        int sum = 0;

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                    sum+=f.length();
//                        System.out.printf("%s: [%s]%n",
//                                f.getName(), f.length());

                    }
                }
            }
        }

        System.out.println("Folder size: " + sum);

    }
}
