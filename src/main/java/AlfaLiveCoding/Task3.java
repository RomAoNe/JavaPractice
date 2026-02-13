package AlfaLiveCoding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        //Подсчет вхождений подстрок java в строке
        // игнорируя регистр
        // "Hello, Java java java! Programming in Java, is fun. Fun is good!"

        String string = "Hello, Java java java! Programming in Java, is fun. Fun is good!";
        System.out.println(getEntriesOfJava(string));

        Map<String, Long> map = Arrays.stream(string.replaceAll("\\p{P}", "").toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }

    public static int getEntriesOfJava(String string) {
        String wordToCount = "java";
        int entriesCount = 0;

        for (String word : string.toLowerCase().split(" ")) {
            if (word.replaceAll("[.,!]", "").equals(wordToCount)) {
                entriesCount++;
            }
        }

        return entriesCount;
    }
}