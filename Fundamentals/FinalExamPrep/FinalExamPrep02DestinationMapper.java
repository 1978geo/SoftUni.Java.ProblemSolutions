package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExamPrep02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();
        String locationsRegex = "([=\\/])(?<locations>[A-Z]([A-Za-z]{2,}))(\\1)";
//        String regex = "(=|\\/)(?<locations>[A-Z]([A-Za-z][A-Za-z]+))(\\1)";

        Pattern pattern = Pattern.compile(locationsRegex);
        Matcher matcher = pattern.matcher(info);
        List<String> locationList = new ArrayList<>();
        int sum = 0;
        while (matcher.find()) {
            String location = matcher.group("locations");
            int length = location.length();
            sum += length;
            locationList.add(location);
        }

        System.out.println("Destinations: " + String.join(", ", locationList));

        System.out.println("Travel Points: " + locationList.stream().mapToInt(l -> l.length()).sum());
    }
}
