package LivecodingSessions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 3, 9, 9, 3, 4};

        System.out.println(Arrays.toString(showDuplicates(numbers)));
    }

    public static int[] showDuplicates(int[] numbers ){
        Map<Integer, Long> map = Arrays.stream(numbers).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        return map.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
