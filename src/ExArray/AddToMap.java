package ExArray;

import java.util.HashMap;
import java.util.Map;

public class AddToMap {
    public static void main(String[] args) {

//Write a Java program to add a key-value pair in a map
        Map<String, String> map = new HashMap<>();

        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");

        System.out.println("Map: " + map);

        String newKey = "Key4";
        String newValue = "Value4";
        map.put(newKey, newValue);

        System.out.println("Updated Map: " + map);
    }
}
