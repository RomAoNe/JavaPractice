package JustInCase;

public class Ab_MaxElementOFArray {
    public static void main(String[] args) {
        /*
        🟢 Задача 3.
        Найти максимальный элемент в массиве без Stream.
        */

        int[] arr = {4, 2, 9, -3, 7};

        System.out.println(findMaxElement(arr));
    }

    public static int findMaxElement(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxValue = numbers[0];

        // for each
        for (int value : numbers) {
            if (maxValue < value)
                maxValue = value;
        }

        // classical for
        for (int i = 1; i < numbers.length; i++) {
            if (maxValue < numbers[i])
                maxValue = numbers[i];
        }

        return maxValue;
    }
}