package AlfaLiveCoding;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
    //метод на вход принимает Map<String, Integer>,
    // возвращает Обратную Map<Integer, String>,(поменять местами ключи и значения)

        Map<String, Integer> map = Map.of("first", 1 ,"second" , 2, "third", 3);
        System.out.println(getReversedMap(map));
    }

    public static Map<Integer, String> getReversedMap(Map<String, Integer> map){
        Map<Integer, String> newMap = new HashMap<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            newMap.put(entry.getValue(), entry.getKey());
        }

        return newMap;
    }
}