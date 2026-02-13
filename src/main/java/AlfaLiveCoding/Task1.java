package AlfaLiveCoding;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //метод на вход принимает массив чисел,
        // вернуть Индекс минимального 2-го элемента в массиве

        int[] numbers = {0, 4, 7, 8, 1, 6, 5};

        System.out.println(getSecondMinIndex(numbers));
    }

    public static int getSecondMinIndex(int[] numbers) {
        int secondMinValue = Arrays.stream(numbers)
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second min"));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == secondMinValue) {
                return i;
            }
        }

        return -1;
    }
}