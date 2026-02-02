package JavaLearning;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> browsers = new HashMap<>();

        browsers.put("Chrome", 118);
        browsers.put("Firefox", 115);
        browsers.put("Edge", 116);
        browsers.replace("Edge", 116, 117);

        System.out.println(browsers);
    }
}
