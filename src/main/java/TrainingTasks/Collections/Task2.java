package TrainingTasks.Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Задача 1 удалить дубликаты из списка с помощью коллекций и стримов
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,1,1,1,2,2,2,2,4,4,5,5);

        System.out.println(removeWithStreams(numbers));
    }

    public static Set<Integer> removeDuplicates(List<Integer> numbers){
        return new HashSet<>(numbers);
    }

    public static List<Integer> removeWithStreams(List<Integer> numbers ){
        return numbers.stream()
                .distinct()
                .toList();
    }
}