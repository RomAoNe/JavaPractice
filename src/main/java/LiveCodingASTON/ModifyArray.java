package LiveCodingASTON;

import java.util.Arrays;

public class ModifyArray {
    public static void main(String[] args) {
        /*
        //TODO: Каждое третье число в массиве (начиная с индекса 2) нужно умножить на 2, если оно отрицательное
           / Пример входных данных: int[] arr = {1, 1, -3, 5, 6, 1, 3, -5, -9};
           // Выходные данные: [1, 1, -6, 5, 6, 1, 3, -5, -18]
         */

        int[] arr = {1, 1, -3, 5, 6, 1, 3, -5, -9};

        modifiedArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void modifiedArray(int[] arr){
        for (int i = 2; i < arr.length; i+=3) {
            if (arr[i] < 0){
                arr[i] *= 2;
            }
        }
    }
}
