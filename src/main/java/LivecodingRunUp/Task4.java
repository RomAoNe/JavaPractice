package LivecodingRunUp;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        /*
            4
            Задача Имеется мапа Map<Integer, String> originalMap = Map.of(1, "One", 2, "Two", 3, "Three");.
            Требуется создать метод, который поменяет местами ключи и значения,
            то есть вернет новую мапу Map<String, Integer>,
            где строковые значения станут ключами, а целые числа — значениями.
         */

        Map<Integer, String> originalMap = Map.of(1, "One", 2, "Two", 3, "Three");

        System.out.println(reverseMap(originalMap));
        System.out.println(reverseWithStream(originalMap));
    }

    public static Map<String, Integer> reverseMap(Map<Integer, String> map) {
        Map<String, Integer> reversedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }

        return reversedMap;
    }

    public static Map<String, Integer> reverseWithStream(Map<Integer, String> map) {
        return map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }
}