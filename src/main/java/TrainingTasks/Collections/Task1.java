package TrainingTasks.Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Создайте HashMap, где ключ — это имя (String),
 * а значение — номер телефона (String). Добавьте 3 записи.
 * Напишите метод, который по имени возвращает номер телефона.
 * Если имя не найдено, вернуть "Не найден".
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>(Map.of("Ivan", "12345677", "Karl", "9876543312", "John", "555666773"));
        String validName = "Ivan";
        String invalidName ="George";

        System.out.println(getNumber(phoneBook, validName));
        System.out.println(getNumber(phoneBook, invalidName));
    }

    public static String getNumber(Map<String, String> phoneBook, String name) {
        return phoneBook.getOrDefault(name, "Не найден");
    }
}