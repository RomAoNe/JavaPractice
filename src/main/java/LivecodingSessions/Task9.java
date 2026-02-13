package LivecodingSessions;

import java.util.*;
import java.util.stream.Collectors;

//Дан список строк ["яблоко", "банан", "апельсин", "банан", "киви", "яблоко"].
// Напишите метод, который найдет и выведет все элементы, которые встречаются больше одного раза.
public class Task9 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("яблоко", "банан", "апельсин", "банан", "киви", "яблоко"));

        System.out.println(showFruitMoreThanOne(fruits));
    }

    private static List<String> showFruitMoreThanOne(List<String> words){
        Set<String> set1 = new HashSet<>();
        return  words.stream()
                .filter(element -> !set1.add(element))
                .collect(Collectors.toList());
    }
}