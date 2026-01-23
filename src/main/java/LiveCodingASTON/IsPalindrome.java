package LiveCodingASTON;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("leveL"));
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.toLowerCase().charAt(left) != text.toLowerCase().charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
