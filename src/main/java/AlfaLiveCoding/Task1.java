package AlfaLiveCoding;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //метод на вход принимает массив чисел,
        // вернуть Индекс минимального 2го элемента в массиве

        int[] numbers = {2, 4, 7, 8, 1, 6, 5};

        System.out.println(getSecondMaxIndex(numbers));
    }

    public static int getSecondMaxIndex(int[] numbers){
        int secondMaxValue = Arrays.stream(numbers)
                .sorted()
                .skip(1)
                .findFirst()
                .getAsInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == secondMaxValue){
                return i;
            }
        }

        return Integer.MIN_VALUE;
    }
}