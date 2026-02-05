package LivecodingRunUp;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        /*
        Написать обобщённый метод, который принимает массив элементов
        произвольного типа K и возвращает карту Map<K, Integer>,
        где ключом является сам элемент массива, а значением — количество его вхождений в массив.
         */
        String[] strings = {"Apple", "Banana", "Apple", "Orange" };
        System.out.println(getFruits(strings));
    }

    public static<K> Map<K, Integer> getFruits(K[] strings){
        Map<K, Integer> fruits = new HashMap<>();

        for (K fruit : strings) {
            fruits.merge(fruit, 1, Integer::sum);
        }

        return fruits;
    }


}
