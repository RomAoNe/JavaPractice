package LiveCodingASTON;

public class WordsCounter {
    public static void main(String[] args) {
        String string = "Hello Roman. Roman, how are you doing ?";

        System.out.println(getWordsAmount(string));
        System.out.println(countWordsWithoutSplit(string));
    }

    public static int getWordsAmount(String string){
        int wordsCount = string.split("\\s+").length;

        return wordsCount;
    }

    public static int countWordsWithoutSplit(String string){
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);

            if (Character.isWhitespace(symbol)){
                inWord = false;
            } else if (!inWord){
                inWord = true;
                count++;
            }
        }

        return count;
    }
}
