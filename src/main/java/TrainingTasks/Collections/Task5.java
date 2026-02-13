package TrainingTasks.Collections;

//Условие: Дан массив целых чисел. Нужно найти сумму всех чисел, которые больше 5.
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6, 6, 7, 8, 9, 10};

        System.out.println(getSum(numbers));
    }

    public static int getSum(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number > 5)
                .sum();
    }
}