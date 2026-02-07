package LivecodingPractice;

public class Task1_ReplaceFirstLetter {
    public static void main(String[] args) {
        /*
            Изменить первую букву в слове.
            Пример: "Oston" → "Aston"
        */

        String string = "Oston";
        char firstChar = 'A';

        System.out.println(replaceFirstCharSimpleCase(string, firstChar));
        System.out.println(replaceFirstCharWithBuilder(string, firstChar));
    }

    public static String replaceFirstCharSimpleCase(String string, char symbol) {
        char[] chars = string.toCharArray();
        chars[0] = symbol;

        return new String(chars);
    }

    public static String replaceFirstCharWithBuilder(String string, char firstChar) {
        StringBuilder builder = new StringBuilder(string);

        builder.setCharAt(0, firstChar);

        return builder.toString();
    }
}