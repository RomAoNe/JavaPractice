package TrainingTasks.Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class a_ReverseArray {
    public static void main(String[] args) {
        /*
        🟡 Задача 4.
        Убрать дубликаты из массива, сохранив порядок.
        int[] arr = {1,2,2,3,4,4,5};
        */

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }

    public static int[] removeDuplicates(int[] numbers) {
        Set<Integer> sortedNumbers = new LinkedHashSet<>();

        for (int number : numbers) {
            sortedNumbers.add(number);
        }

        int[] result = new int[sortedNumbers.size()];
        int index = 0;

        for (int number : sortedNumbers) {
            result[index++] = number;
        }

        return result;
    }
}
