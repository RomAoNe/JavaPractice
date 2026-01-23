package LiveCodingASTON;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("sell", "les"));
    }

    public static boolean isAnagram(String first, String second){
        // Если длины разные — это не анаграмма
        if (first.length() != second.length()) {
            return false;
        }

        // Map для подсчёта символов
        Map<Character, Integer> map = new HashMap<>();

        // Считаем символы первой строки
        for (char c : first.toCharArray()){
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        return true;
    }
}
