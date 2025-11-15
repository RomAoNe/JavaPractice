package LiveCodingASTON;

public class ReverseStringOrNumber {
    public static void main(String[] args) {
        /*
        1) Развернуть строку 3 способами(StringBuilder нельзя), в том числе используя рекурсию
        2) Развернуть число 123 (в 321)
        3) метод принимает массив чисел, и посчитать сумму чисел и вывести строкой - четное, нечетное
        */

        // First Task
        String word = "Hello World";

        printString(word);
        word = reverseStringWithArray(word);
        printString(word);
        word = reverseStringWithRecursion(word);
        printString(word);
        word = reverseStringWithCycle(word);
        printString(word);
    }

    public static String reverseStringWithArray(String string) {
        char[] chars = string.toCharArray();
        int leftEdge = 0;
        int rightEdge = chars.length - 1;

        while (leftEdge < rightEdge) {
            char tempChar = chars[leftEdge];
            chars[leftEdge] = chars[rightEdge];
            chars[rightEdge] = tempChar;

            leftEdge++;
            rightEdge--;
        }

        return new String(chars);
    }

    public static String reverseStringWithRecursion(String string) {
        if (string.isEmpty()) return string;
        return reverseStringWithRecursion(string.substring(1)) + string.charAt(0);
    }

    public static String reverseStringWithCycle(String string) {
        char[] result = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            result[i] = string.charAt(string.length() - 1 - i);
        }

        return new String(result);
    }

    public static void printString(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}
