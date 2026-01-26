package TrainingTasks.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class DifferentTasks {
    public static void main(String[] args) {
//        getStringsLengths();
//        countStrings();
//        findFirstMoreThanTen();
//        leaveStringsStartsWithA();
//        leadToUppercase();
//        sumNumbers();
//        deleteDuplicates();
//        sortDown();
//        sumLengthOfWords();
        takeThreeFirstNumbers();
    }

    public static void getStringsLengths() {
        /* Дан список строк. Получить длину список длин
        Input:  ["Java", "QA", "Stream"]
        Output: [4,2,6]*/

        List<String> stringList = List.of("Java", "QA", "Stream");

        List<Integer> listOfLength = stringList.stream()
                .map(String::length)
                .toList();

        System.out.println(listOfLength);
    }

    public static void countStrings() {
        /*
        Посчитать количество слов длиннее 3
        Input: ["cat","java","stream","api"]
        Output: 2
         */

        List<String> words = List.of("cat", "java", "stream", "api");

        long count = words.stream()
                .filter(w -> w.length() > 3)
                .count();

        System.out.println(count);
    }

    public static void findFirstMoreThanTen() {
        /*
        Найти первый элемент больше 10
        Input: [3,5,7,11,2,20]
        Output: 11
         */

        List<Integer> numbers = List.of(3, 5, 7, 11, 2, 20);
        Integer result = numbers.stream()
                .filter(number -> number > 10)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }

    public static void leaveStringsStartsWithA() {
        /*
        Оставить строки, начинающиеся с "A"
        Input: ["Apple","Banana","Avocado","Berry"]
        Output: ["Apple","Avocado"]
         */

        List<String> words = List.of("Apple", "Banana", "Avocado", "Berry");
        List<String> results = words.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(results);
    }

    public static void leadToUppercase() {
        /* To Uppercase
        Input: ["java","qa","stream"]
        Output: ["JAVA","QA","STREAM"]
         */

        List<String> words = List.of("java", "qa", "stream");

        List<String> result = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void sumNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        int sum = numbers.stream()
                .mapToInt(number -> number)
                .sum();

        System.out.println(sum);
    }

    public static void deleteDuplicates() {
        /*
        Убрать дубликаты
        Input: [1,2,2,3,3,4]
        Output: [1,2,3,4]
        */
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }

    public static void sortDown() {
        /*
        Сортировка по убыванию
        Input: [3,1,5,2]
        Output: [5,3,2,1]
        */

        List<Integer> numbers = List.of(3, 1, 5, 2);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> Integer.compare(b, a))
//                .sorted((a, b) -> (b - a))
//                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }

    public static void sumLengthOfWords() {
        /* Нужно:
        -взять длины
        - сложить
        Input: ["java", "qa", "stream"]
        Output: 12
        */

        List<String> words = List.of("java", "qa", "stream");

        Integer result = words.stream()
                .mapToInt(w -> w.length())
                .sum();

        System.out.println(result);
    }

    public static void takeThreeFirstNumbers() {
        /*
        Взять первые 3 элемента
        Input: [10,20,30,40,50]
        Output: [10,20,30]
        */

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        List<Integer> firstNumbers = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(firstNumbers);
    }
}
