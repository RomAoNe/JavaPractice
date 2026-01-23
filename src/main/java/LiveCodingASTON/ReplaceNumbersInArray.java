package LiveCodingASTON;

import java.util.Arrays;

public class ReplaceNumbersInArray {
    public static void main(String[] args) {
        /* в массиве {1, 2, 3, 4, 5, 6, 7, 8, 9}
        поменять местами четные и нечетные числа
        Вывод: {2, 1, 4, 3, 6, 5, 8, 7, 9}
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(replaceNumbers(numbers)));
    }

    public static int[] replaceNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 != 0 && numbers[i + 1] % 2 == 0) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        return numbers;
    }
}
