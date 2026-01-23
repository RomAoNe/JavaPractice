package LiveCodingASTON;

import java.sql.SQLOutput;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Развернуть строку 3 способами + 1 через StringBuilder.reverse()
         */

        String words = "dlrow olleH";

        char[] chars = words.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }

        System.out.println(new String(chars));
    }

    // Разворот через массив символов и цикл while
    public static String reverseWithWhile(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        char[] chars = string.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }

        return new String(chars);
    }

    // Разворот с помощью пустой строки и цикл for
    public static String reverseWithFor(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        String resultString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            resultString += string.charAt(i);
        }

        return resultString;
    }

    // Разворот с помощью StringBuilder и цикл for
    public static String reverseWithStringBuilder(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    // Разворот с помощью StringBuilder(string).reverse().toString();
    public static String reverseWithStringBuilderQuick(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        return new StringBuilder(string).reverse().toString();
    }
}