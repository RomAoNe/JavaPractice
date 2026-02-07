package JustInCase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ac_RemoveDuplicates {
    public static void main(String[] args) {
        /*
        🟡 Задача 4.
        Убрать дубликаты из массива, сохранив порядок.
        input:    int[] arr = {1,2,2,3,4,4,5};
        output:   [1,2,3,4,5]
        */

        int[] arr = {1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 5};

        System.out.println(Arrays.toString(deleteWithLoop(arr)));
        System.out.println(removeDuplicatesWithHashSet(arr));
        System.out.println(Arrays.toString(removeDuplicatesWithStreams(arr)));
    }

    //    через цикл
    public static int[] deleteWithLoop(int[] numbers) {
        int[] temp = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = numbers[i];
            }
        }

        int[] result = new int[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    //  через хеш сет
    public static Set<Integer> removeDuplicatesWithHashSet(int[] numbers) {
        Set<Integer> integerSet = new HashSet<>();

        for (int number : numbers) {
            integerSet.add(number);
        }

        return integerSet;
    }

    // через стримы
    public static int[] removeDuplicatesWithStreams(int[] numbers) {
        int[] result = Arrays.stream(numbers)
                .distinct()
                .toArray();

        return result;
    }
}