package LivecodingSessions;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "hello");
        map.put(2, "Buddy");

        replaceMap(map);

        System.out.println(map);
    }

    public static void replaceMap(Map<Integer, String> map) {
        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<Integer, String> value : map.entrySet()) {
            newMap.put(value.getValue(), value.getKey());
        }

        System.out.println(newMap);
    }
}