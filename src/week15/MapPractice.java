package week15;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {
        one();
    }

    public static void one() {

        Map<String, Object> fruits = new HashMap<>();
        fruits.put("apple", 7);
        fruits.put("banana", 5);
        fruits.put("grape", 2.5);
        fruits.put("orange", "out of stock");

        System.out.println(fruits);
        System.out.println(fruits.get("grape"));
        System.out.println(fruits.size());

        System.out.println(fruits.values());
        System.out.println(fruits.keySet());

        for (String key : fruits.keySet()) {
            System.out.println(fruits.get(key));
        }

        for (Object value : fruits.values()) {
            System.out.println(value);
        }

        System.out.println("fruits.containsKey(\"banana\") = " + fruits.containsKey("banana"));
        System.out.println("fruits.containsValue(10) = " + fruits.containsValue(10));

//        fruits.clear();
        System.out.println(fruits);

    }
}
