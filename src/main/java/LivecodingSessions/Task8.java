package LivecodingSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Дан список целых чисел [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
// Напишите метод, который удалит из него все четные числа и выведет результат.
public class Task8 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        removeEvenWithStreams(ints);
        removeEvenWithCollection(numbers);
    }

    public static void removeEvenWithStreams(int[] numbers) {
        List<Integer> listOfNumbers = Arrays.stream(numbers)
                .boxed()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println(listOfNumbers);
    }

    public static void removeEvenWithCollection(Integer[] numbers){
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(numbers));
        listOfNumbers.removeIf(n -> n % 2 == 0);

        System.out.println(listOfNumbers);
    }
}