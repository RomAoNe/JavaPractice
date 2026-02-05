package LivecodingRunUp;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        /*
            Условие: Дан массив целых чисел.
            Каждое третье число в массиве (начиная с индекса 2) нужно умножить на 2,
            если оно отрицательное.
         */

        int[] arr = {1, 1, -3, 5, 6, 1, 3, -5, -9};

        System.out.println(Arrays.toString(getArray(arr)));
    }

    public static int[] getArray(int[] numbers){
        for (int i = 2; i < numbers.length; i+=3) {
            if (numbers[i] < 0){
                numbers[i] *= 2;
            }
        }

        return numbers;
    }
}
