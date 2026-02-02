package LivecodingRunUp;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
            1 Задача Разворот строки String str = "Раз два три" 3 любыми способами;
         */

        String str = null;

        System.out.println(reverseWithChars(str));
//        System.out.println(reverseWithWhile(str));
//        System.out.println(reverseStringBuilder(str));
    }

    public static String reverseWithChars(String string) {
        if(string == null){
            return null;
        }

        char[] chars = string.toCharArray();
        char[] reversed = new char[chars.length];
        int index = 0;

        for (int i = chars.length - 1; i > 0; i--) {
            reversed[index++] = chars[i];
        }

        return Arrays.toString(reversed);
    }

    public static String reverseWithWhile(String string) {
        char[] chars = string.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[right];
            chars[right--] = chars[left];
            chars[left++] = temp;
        }

        return Arrays.toString(chars);
    }

    public static String reverseStringBuilder(String string) {
        StringBuilder builder = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }

        return builder.toString();
    }
}
