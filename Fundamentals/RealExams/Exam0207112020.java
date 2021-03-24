package SoftUniJavaProblemSolutions.Fundamentals.RealExams;

import java.util.*;

public class Exam0207112020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] item = scanner.nextLine().split(" ");
        List<String> newItems = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] command = input.split(" ");

            switch (command[0]) {
                case "reverse":
                    int startIndex = Integer.parseInt(command[2]);
                    int countIndex = Integer.parseInt(command[4]);
                    if(countIndex<=item.length){

                        for (int i = startIndex; i < (startIndex + countIndex); i++) {
                            String brandNewItem = item[i];
                            newItems.add(brandNewItem);
                        }
                        Collections.reverse(newItems);

                        if(startIndex!=0){
                        for (int i = 0; i < startIndex; i++) {
                            newItems.add(i, item[i]);
                        }}
                    if(startIndex+countIndex <item.length){
                        for (int i = startIndex + countIndex; i < item.length; i++) {
                            newItems.add(i, item[i]);
                        }}}

                    break;
                case "sort":
                    startIndex = Integer.parseInt(command[2]);
                    countIndex = Integer.parseInt(command[4]);
                    if(countIndex<=item.length){
                        for (int i = startIndex; i < (startIndex + countIndex); i++) {
                            String brandNewItem = item[i];
                            newItems.add(brandNewItem);
                        }
                        Collections.sort(newItems);

                    if(startIndex!=0){
                        for (int i = 0; i < startIndex; i++) {
                            newItems.add(i, item[i]);
                        }}
                    if(startIndex+countIndex <item.length){
                        for (int i = startIndex + countIndex; i < item.length; i++) {
                            newItems.add(i, item[i]);
                        }}}
                        break;
                case "remove":

                    int countRemoveIndex = Integer.parseInt(command[1]);

                    for (int i = countRemoveIndex; i < item.length; i++) {
                            String brandNewItem = item[i];
                            newItems.add(brandNewItem);
                        }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.print(String.join(", ", newItems));
    }
}
