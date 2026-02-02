package JavaLearning;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<String> names =
                new ArrayList<>(List.of("Anna", "Bob", "Charlie", "Anna", "Diana", "Bob"));

        List<String> browsers =
                new ArrayList<>(List.of("Chrome", "Firefox", "Edge", "Safari"));

        Set<String> userNames = new HashSet<>(names);

        Map<String, String> userBrowsers = new HashMap<>();

        int i = 0;
        for (String name : userNames) {
            userBrowsers.put(name, browsers.get(i++));
        }

        for (Map.Entry<String, String> entry : userBrowsers.entrySet()) {
            System.out.println(entry.getKey().toString() + " -> " + entry.getValue().toString());
        }
    }
}
