package LiveCodingASTON;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 4, 2, 8, 5, 6, 3, 7, 0};
        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
