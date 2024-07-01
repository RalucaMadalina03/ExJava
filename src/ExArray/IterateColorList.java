package ExArray;

import java.util.ArrayList;
import java.util.List;

public class IterateColorList {
    public static void main(String[] args) {

        //  Iterate through all elements in an ArrayList

      List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Iterating through the colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
