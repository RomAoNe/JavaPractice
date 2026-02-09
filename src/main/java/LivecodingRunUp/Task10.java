package LivecodingRunUp;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        /*
        Написать обобщённый метод, который принимает массив элементов
        произвольного типа K и возвращает карту Map<K, Integer>,
        где ключом является сам элемент массива, а значением — количество его вхождений в массив.
         */
        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Pineapple",
                "Orange", "Orange"};

        System.out.println(getEntriesValue(fruits));
    }

    public static <K> Map<K, Integer> getEntriesValue(K[] strings){
        Map<K, Integer> entries = Arrays.stream(strings)
                .collect(Collectors.toMap(k->k, v -> 1, Integer::sum));

        return entries;
    }
}