package LivecodingSessions;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 3, 9, 7};

        printMin(numbers);
    }

    public static void printMin(int[] numbers) {
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[index]) {
                index = i;
            }
        }

        System.out.println(index);
    }
}
