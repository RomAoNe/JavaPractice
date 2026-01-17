package LiveCodingASTON;

public class ReverseStringOrNumber {
    public static void main(String[] args) {
        /*
            Развернуть число 123 (в 321)
        */

        int number = 123;

        System.out.println(reverseIntByDividing(number));
        System.out.println(reverseIntByString(number));
        System.out.println(reverseWithRecursion(number));
    }

    // Разворот числа с помощью деления и цикла while
    public static int reverseIntByDividing(int number) {
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }

    // Разворот через строку
    public static int reverseIntByString(int number) {
        String string = String.valueOf(number);
        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        return Integer.parseInt(reversedString);
    }

    // Разворот через рекурсию
    public static int reverseWithRecursion(int number) {
        return number;
    }
}













