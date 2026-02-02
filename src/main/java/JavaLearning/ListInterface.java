package JavaLearning;

import java.util.Set;
import java.util.TreeSet;

public class ListInterface {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Chrome");
        set.add("Firefox");
        set.add("Chrome");
        set.add("Edge");
        set.add("Firefox");

        System.out.println(set);

        System.out.println(set.contains("Safari"));
    }
}
