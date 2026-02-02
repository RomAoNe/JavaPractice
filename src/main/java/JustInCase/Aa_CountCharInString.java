package JustInCase;

public class Aa_CountCharInString {
    public static void main(String[] args) {
        /*
        🟢 Задача 2.
        Посчитать количество символа 'a' в строке "Aligator" без Stream.
        Регистр не учитывать.
         */

        char symbol = 'a';
        String string = "Alligator";

        System.out.println(countSymbolRepeats(symbol, string));
    }

    public static Integer countSymbolRepeats(char symbol, String string) {
        symbol = Character.toLowerCase(symbol);

        char[] chars = string.toLowerCase().toCharArray();
        int counter = 0;

        for (Character element : chars) {
            if (element==symbol) {
                counter++;
            }
        }

        return counter;
    }
}
