package LivecodingRunUp;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        /*
        3 Задача Из коллекции
        List<Integer> sortedList = List.of(1,2,2,3,4,5,5,6,6,7,8,8,9);
        удалить все повторяющиеся элементы при помощи stream
         */

        List<Integer> sortedList = List.of(9, 9, 9, 8, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8);

        System.out.println(removeElements(sortedList));
    }

    public static List<Integer> removeElements(List<Integer> numbers) {
        List<Integer> integers = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return integers;
    }
}
