package LivecodingRunUp;

public class Task2 {
    public static void main(String[] args) {
        /*
            2 Задача Подсчитать количество символов char symbol = ‘a’ в строке String str = "Анаконда";
        */

        char symbol = 'а';
        String str = "Анаконда";

        System.out.println(countChars(symbol, str));
    }

    public static int countChars(char symbol, String string) {
        char[] chars = string.toLowerCase().toCharArray();
        int counter = 0;

        for (char target : chars) {
            if (target == symbol) {
                counter++;
            }
        }

        return counter;
    }
}