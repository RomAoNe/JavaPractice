package TrainingTasks.Strings;

public class A_ReverseString {
    public static void main(String[] args) {
        String word = "avaJ";

        System.out.println(reverseWithChars(word));
        System.out.println(reverseWithWhile(word));
        System.out.println(reverseWithBuilder(word));
        System.out.println(reverseWithFor(word));
    }

    public static String reverseWithChars(String string) {
        char[] chars = string.toCharArray();
        int index = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            chars[index++] = string.charAt(i);
        }

        return new String(chars);
    }

    public static String reverseWithWhile(String string) {
        char[] chars = string.toCharArray();
        int right = chars.length - 1;
        int left = 0;

        while (right > left) {
            char temp = chars[right];
            chars[right--] = chars[left];
            chars[left++] = temp;
        }

        return new String(chars);
    }

    public static String reverseWithBuilder(String string) {
        StringBuilder builder = new StringBuilder();
        int index = string.length() - 1;

        for (int i = index; i >= 0; i--) {
            builder.append(string.charAt(i));
        }

        return builder.toString();
    }

    public static String reverseWithFor(String string) {
        char[] chars = string.toCharArray();

        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }
}
