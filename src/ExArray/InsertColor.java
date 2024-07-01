package ExArray;

import java.util.ArrayList;
import java.util.List;

public class InsertColor {
    public static void main(String[] args) {

        //Insert an element into the ArrayList at the first position

        List<String> colors = new ArrayList<>();


        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");


        colors.add(0, "Purple");


        System.out.println("Colors in the list after insertion: " + colors);
    }
}
