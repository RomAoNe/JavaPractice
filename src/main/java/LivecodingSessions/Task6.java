package LivecodingSessions;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        List<Integer> newList =

        int a = 390;
        int b = 715;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}