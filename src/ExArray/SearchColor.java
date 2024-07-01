package ExArray;

import java.util.ArrayList;
import java.util.List;

public class SearchColor {
    public static void main(String[] args) {

        //Search an element in an ArrayList
       List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        String searchColor = "Green";
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is in the list.");
        } else {
            System.out.println(searchColor + " is not in the list.");
        }
    }
}
