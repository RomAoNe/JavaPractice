package AlfaLiveCoding;

import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        //метод на вход принимает массив чисел,
        // вернуть Индекс 2-го максимального элемента в массиве

        int[] numbers = {0, 4, 7, 8, 1, 6, 5};
        int[] emptyArray = {};
        int[] tooShortArray = {1};
        int[] noSecondMaxArray = {2, 2, 2, 2, 2, 2};

        System.out.println(getSecondMaxIndex(noSecondMaxArray));
    }

    public static int getSecondMaxIndex(int[] numbers) throws IllegalArgumentException {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain more than 1 elements");
        }

        int secondMax = Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second max"));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == secondMax) {
                return i;
            }
        }

        return 1;
    }
}
