package LiveCodingASTON;

public class FindSecondMaximum {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 1, 7, 8};

        System.out.println(findSecondMax(numbers));
    }

    public static Integer findSecondMax(int[] array) {
        // Храним максимальный и второй максимальный
        Integer max = null;
        Integer secondMax = null;

        // Проходим по массиву
        for (int value : array) {

            // Если нашли большее значение
            if (max == null || value > max) {
                secondMax = max;
                max = value;
            }
            // Если значение меньше max, но больше secondMax
            else if (value != max && value > secondMax) {
                secondMax = value;
            }
        }

        return secondMax;
    }
}
