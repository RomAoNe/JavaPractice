package LivecodingRunUp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        /*
        Написать обобщённый метод, который принимает массив элементов
        произвольного типа K и возвращает карту Map<K, Integer>,
        где ключом является сам элемент массива, а значением — количество его вхождений в массив.
         */
        String[] strings = {"Apple", "Banana", "Apple", "Orange", "Pineapple",
                "Orange", "Orange"};
    }

    public static <K> Map<K, Integer> getFruits(K[] words) {
        Map<K, Integer> fruits = new HashMap<>();

        for (K fruit : words) {
            fruits.merge(fruit, 1, Integer::sum);
        }

        return fruits;
    }

    public static <K> Map<K, Integer> getEntries(K[] words) {
        Map<K, Integer> wordsMap = new HashMap<>();

        for (K word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        return wordsMap;
    }

    public static <K> Map<K, Integer> getEntriesLongMethod(K[] words) {
        Map<K, Integer> newMap = new HashMap<>();

        for (K word : words) {
            if (newMap.containsKey(word)) {
                newMap.put(word, newMap.get(word) + 1);
            } else {
                newMap.put(word, 1);
            }
        }

        return newMap;
    }

    public static <K> Map<K, Integer> getEntriesWithStreams(K[] words) {
        Map<K, Integer> newMap = Arrays.stream(words)
                .collect(Collectors.toMap(key -> key, value -> 1, Integer::sum));

        return newMap;
    }
}