package SoftUniJavaProblemSolutions.Advanced.WorkshopCustomDataStructures.L0701Jar;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar =new Jar<>();

        jar.add("First");
        jar.add("Second");


        System.out.println(jar.remove());
    }
}