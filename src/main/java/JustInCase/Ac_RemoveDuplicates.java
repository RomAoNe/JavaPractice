package JustInCase;

import java.util.Arrays;

public class Ac_RemoveDuplicates {
    public static void main(String[] args) {
        /*
        🟡 Задача 4.
        Убрать дубликаты из массива, сохранив порядок.
        input:    int[] arr = {1,2,2,3,4,4,5};
        output:   [1,2,3,4,5]
        */

        int[] arr = {1,1,1,1,1, 2, 2, 3, 4, 4, 5};

        System.out.println(Arrays.toString(deleteWithLoop(arr)));
    }


//    через цикл
    public static int[] deleteWithLoop(int[] array) {
        int[] temp = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate){
                temp[index++] = array[i];
            }
        }

        return temp;
    }
}
