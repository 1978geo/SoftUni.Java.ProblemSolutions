package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExamPrep02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> coolEmojis = new ArrayList<>();
        String numberRegex = "\\d";
        Pattern numberPattern = Pattern.compile(numberRegex);
        Matcher numberMatcher = numberPattern.matcher(text);
        BigInteger coolThreshold = BigInteger.valueOf(1);

        while (numberMatcher.find()) {
            BigInteger currentNumber = BigInteger.valueOf(Integer.parseInt(numberMatcher.group()));
            coolThreshold = coolThreshold.multiply(currentNumber);
        }

        int count = 0;

        String regexEmoji = "(::|\\*\\*)(?<emoji>[A-Z][a-z][a-z]+)(\\1)";
        Pattern emojiPattern = Pattern.compile(regexEmoji);
        Matcher emojiMatcher = emojiPattern.matcher(text);

        while (emojiMatcher.find()) {
            count++;
            String currentEmoji = emojiMatcher.group("emoji");
            int currentEmojiSum = 0;
            for (int i = 0; i < currentEmoji.length(); i++) {

                int emojiValue = currentEmoji.charAt(i);
                currentEmojiSum += emojiValue;

            }
            if (BigInteger.valueOf(currentEmojiSum).compareTo(coolThreshold) >= 0) {
                coolEmojis.add(emojiMatcher.group());
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(count + " emojis found in the text. The cool ones are:");
        for (int i = 0; i < coolEmojis.size(); i++) {
            System.out.println(coolEmojis.get(i));
        }
    }
}
