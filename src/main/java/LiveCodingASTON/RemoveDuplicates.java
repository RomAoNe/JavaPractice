package LiveCodingASTON;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("Bananao"));
    }

    public static String removeDuplicates(String text){
        // LinkedHashSet сохраняет порядок добавления
        Set<Character> seen = new LinkedHashSet<>();

        // Проходим по всем символам строки
        for(char c: text.toCharArray()){

            // Set не добавит элемент, если он уже существует
            seen.add(c);
        }

        // StringBuilder используем для сборки результата
        StringBuilder result = new StringBuilder();

        for(char c : seen){
            result.append(c);
        }

        return result.toString();
    }
}
