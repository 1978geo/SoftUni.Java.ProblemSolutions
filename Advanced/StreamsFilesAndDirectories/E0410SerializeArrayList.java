package SoftUniJavaProblemSolutions.Advanced.StreamsFilesAndDirectories;

import java.io.*;
import java.util.List;

public class E0410SerializeArrayList {
    private static final String PATH = "C:/Users/EMEAKO/Desktop/Java Advanced/" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources/list.ser";

    public static void main(String[] args) {
        List<Double> list = List.of(4.5, 3.7, 12.0, 18.8);
        try (FileOutputStream fos = new FileOutputStream(PATH);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(PATH);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Double> deserializerList = (List<Double>) ois.readObject();
            deserializerList.forEach(e -> System.out.println(e));
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

