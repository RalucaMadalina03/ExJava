package ExArray;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {
    public static void main(String[] args){

        Map<String,String> map = new HashMap<>();

        map.put("Key1", "Value1");
        map.put("Key2", "Vaalue2");
        map.put("Key3", "Value3");

        String newKey = "Key4";
        String newValue = "Value4";
        map.put(newKey, newValue);

        System.out.println("Map contents:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    }

