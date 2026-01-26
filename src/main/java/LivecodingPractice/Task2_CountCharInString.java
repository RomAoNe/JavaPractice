package LivecodingPractice;

public class Task2_CountCharInString {
    public static void main(String[] args) {
        /*
            Посчитать количество символа в слове
            Пример: countCharAtWord('a', "Alligator") = 2
            Условия: - метод принимает char и String
                     - регистр не учитывать
                     - вернуть int
         */

        String word = "Alligator";
        char desiredChar = 'a';

        System.out.println(countChar(desiredChar, word));
    }

    public static int countChar(char c, String string) {
        if (string == null || string.isEmpty()){
            return 0;
        }

        char[] chars = string.toLowerCase().toCharArray();
        int counter = 0;

        for(char target: chars){
            if (target == Character.toLowerCase(c) ){
                counter++;
            }
        }

        return counter;
    }
}
