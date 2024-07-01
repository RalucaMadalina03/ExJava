package ExArray;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("HashSet before appending: " + set);

        String elementToAppend = "Orange";

        set.add(elementToAppend);

        System.out.println("HashSet after appending: " + set);
    }
}
