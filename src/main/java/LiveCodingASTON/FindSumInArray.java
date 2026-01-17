package LiveCodingASTON;

public class FindSumInArray {
    public static void main(String[] args) {
        /*
        TODO: Нужно найти сумму всех чисел, которые больше 5
         вход: int[] numbers = {1, 4, 6, 7, 2, 3, 7};
         выход: Сумма чисел больше 5: 20
         */

        int[] numbers = {1, 4, 6, 7, 2, 3, 7};

        System.out.println("Sum of numbers more than 5: " + countNumbers(numbers));
    }

    public static int countNumbers(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number > 5){
                sum+= number;
            }
        }

        return sum;
    }
}