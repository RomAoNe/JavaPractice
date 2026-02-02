package TrainingTasks.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapsGoodsAndPrices {
    public static void main(String[] args) {
        Map<String, Integer> prices = new HashMap<>();
        prices.put("Book", 500);
        prices.put("Pen", 100);
        prices.put("Notebook", 300);
        prices.put("Bag", 1500);

        /*
            Выведи все товары дороже 300.
            Посчитай общую сумму всех товаров.
            Найди самый дорогой товар.
         */

        System.out.println("\nGoods chipper than 300");

        int commonPrice = 0;
        int maxPrice = 0;
        String mostExpensiveGood = null;

        for (Map.Entry<String, Integer> entry: prices.entrySet()){
            if (entry.getValue() < 300){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            if (maxPrice< entry.getValue()){
                maxPrice = entry.getValue();
                mostExpensiveGood = entry.getKey();
            }

            commonPrice += entry.getValue();
        }

        System.out.println("\nMost expensive good is: " + mostExpensiveGood + " -> " + maxPrice);
        System.out.println("\nCommon price is: " + commonPrice);
    }
}
