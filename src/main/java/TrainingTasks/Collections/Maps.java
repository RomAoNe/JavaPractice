package TrainingTasks.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> userBrowsers = new HashMap<>();
        userBrowsers.put("Anna", "Chrome");
        userBrowsers.put("Tom", "Edge");
        userBrowsers.put("Piter", "Safari");
        userBrowsers.put("John", "Firefox");
        userBrowsers.put("Thomas", "Chrome");
        userBrowsers.put("Janica", "Chrome");
        userBrowsers.put("Mathew", "Firefox");

        Map<String, Integer> browserStats = new HashMap<>();

        for (Map.Entry<String, String> entry : userBrowsers.entrySet()) {
            String browser = entry.getValue();
            browserStats.put(browser, browserStats.getOrDefault(browser, 0) + 1);
        }

        System.out.println("\nBrowsers statistics:");

        for (Map.Entry<String,Integer> entry : browserStats.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String mostPopularBrowser = null;
        int maxUsers = 0;

        for (Map.Entry<String, Integer> entry: browserStats.entrySet()){
            if (entry.getValue() > maxUsers){
                maxUsers = entry.getValue();
                mostPopularBrowser = entry.getKey();
            }
        }

        System.out.println("most popular browser is " + mostPopularBrowser);
        System.out.println("max amount of users: " + maxUsers);
    }
}