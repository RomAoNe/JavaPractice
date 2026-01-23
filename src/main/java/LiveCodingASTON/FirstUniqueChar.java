package LiveCodingASTON;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(findFirstUnique("swiss"));
    }

    public static Character findFirstUnique(String text) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
