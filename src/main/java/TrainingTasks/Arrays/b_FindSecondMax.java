package TrainingTasks.Arrays;

public class b_FindSecondMax {
    public static void main(String[] args) {
        /*
        🟡 Задача 5.
        Найти второй максимальный элемент в массиве.
        int[] arr = {4, 2, 9, -3, 7};
        */

        int[] numbers = {4, 5, 9, -3, 7, 9};

        System.out.println(findSecondMax(numbers));
    }

    public static int findSecondMax(int[] numbers) {
        int max = numbers[0];
        int secondMax = max - 1;

/*
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondMax = max;
                max = numbers[i];
            } else if(numbers[i] > secondMax){
                secondMax = numbers[i];
            }
        }*/

        for (int number : numbers) {
            if (max < number) {
                secondMax = max;
                max = number;
            } else if (number < max && secondMax < number) {
                secondMax = number;
            }
        }

        return secondMax;
    }
}
