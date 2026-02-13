package TrainingTasks.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Дан массив строк {"Анна", "Петр", "Анна", "Иван", "Петр", "Ольга"}.
// Поместите все имена в HashSet.
// Сколько уникальных имен получилось? Выведите их.
public class Task4 {
    public static void main(String[] args) {
        String[] names = {"Анна", "Петр", "Анна", "Иван", "Петр", "Ольга"};
        countUnique(names);
    }

    public static void countUnique(String[] names) {
        Set<String> uniqueNames = new HashSet<>(Arrays.asList(names));

        System.out.println(uniqueNames + "\n Unique names count: " + uniqueNames.size());
    }
}