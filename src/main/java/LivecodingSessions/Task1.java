package LivecodingSessions;

public class Task1 {
    public static void main(String[] args) {
        String string = "Hello world";

        reverseString(string);
    }

    public static void reverseString(String string){
        char[] chars = string.toCharArray();
        int start = 0;
        int end = chars.length -1;

        while (start < end){
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }

        System.out.println(new String(chars));
    }
}
