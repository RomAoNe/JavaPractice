package LivecodingSessions;

import java.util.HashMap;
import java.util.Map;

//Задача 7 поменять key И value местами в map
public class Task7 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        swapKeyValue(map);
    }

    public static void swapKeyValue(Map<Integer, String> map) {
        Map<String, Integer> swapedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            swapedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(swapedMap);
    }
}
