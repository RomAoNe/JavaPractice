package LivecodingPractice;

import java.util.Arrays;

public class Task1_ReplaceFirstLetter {
    public static void main(String[] args) {
        /*
            Изменить первую букву в слове.
            Пример: "Oston" → "Aston"
        */

        String string = "Oston";

        System.out.println(replaceFirstChar(string));
    }

    public static String replaceFirstChar(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }

        char[] chars = string.toCharArray();
        chars[0] = 'A';

        return new String(chars);
    }
}
