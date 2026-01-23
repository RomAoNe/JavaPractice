package LiveCodingASTON;

public class SumOfNumbersSquares {
    public static void main(String[] args) {
        /*
        Найти сумму квадратов чисел: 0, 1, 2, 3, 4, 5
         */

        int[] numbers = {0, 1, 2, 3, 4, 5};

        System.out.println(getSquaresSum(numbers));
    }

    public static int getSquaresSum(int[] numbers) {
        int sum = 0;
//
//        for (int number : numbers) {
//            sum += number * number;
//        }

        int number = 5;

        for (int i = 0; i <= number; i++) {
            sum += i * i;
        }

        return sum;
    }
}
