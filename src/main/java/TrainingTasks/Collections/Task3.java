package TrainingTasks.Collections;

import java.util.List;

//Задача 4 метод принимает список
// / лист значений, если число четно то умножаем на 100,
// если не четное то на 10.
// Решить при помощи стримов и желательного тернарного оператора
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 2, 4, 5, 6, 7, 8);

        System.out.println(doSomething(numbers));
    }

    public static List<Integer> doSomething(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n % 2 == 0 ? n * 100 : n * 10)
                .toList();
    }
}