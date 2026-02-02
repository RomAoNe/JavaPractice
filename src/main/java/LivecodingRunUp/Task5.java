package LivecodingRunUp;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        //Подсчитать количество дубликатов
        //Подсчитайте, сколько элементов в массиве встречаются более одного раза (учитывайте каждое число только один раз,
        //даже если оно повторяется 3+ раза).
        //Ввод: [1, 2, 2, 3, 3, 3] → вывод: 2 (числа 2 и 3 — дубликаты)
        //Ввод: [1, 2, 3] → вывод: 0
         */

        int[] numbers = {1, 4, 4, 2, 2, 2, 2, 2, 1, 1, 2, 2, 3, 3, 3};

        System.out.println(countDuplicateValues(numbers));


    }

/*    public static int countDuplicates(int[] numbers) {
        int uniqueNumber = 0;
        int counter;

        for (int i = 0; i < numbers.length; i++) {
            uniqueNumber = numbers[i];
            counter = 0;

            for (int j = i+1; j < numbers.length - 1 - i; j++) {
                if (uniqueNumber == numbers[j]){
                    counter++;
                }
            }
        }
    }*/

    public static int countDuplicateValues(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int count = 0;
        boolean hasDuplicate = false;

        for (int i = 1; i < copy.length; i++) {
            if (copy[i] == copy[i - 1]) {
                if (!hasDuplicate) {
                    count++;
                    hasDuplicate = true;
                }
            } else {
                hasDuplicate = false;
            }
        }

        return count;
    }
}