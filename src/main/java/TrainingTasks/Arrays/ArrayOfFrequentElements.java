package TrainingTasks.Arrays;

/*
Дан массив. Получить новый массив из повторяющихся элементов первого массива
input: int[] arr = {1, 2, 2, 3, 6, 4, 4, 4, 5, 6};
output: {2, 4, 6}
*/

import java.util.Arrays;
import java.util.LinkedHashMap;

public class ArrayOfFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 6, 4, 4, 4, 5, 6};

        System.out.println(Arrays.toString(getFrequentElements(arr)));
    }

    public static int[] getFrequentElements(int[] numbers) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue()> 1)
                .mapToInt(entry -> entry.getKey())
                .toArray();
    }
}