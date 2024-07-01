package ExArray;

import java.util.ArrayList;

public class RemoveColor {
    public static void main(String[] args) {


        //Remove the third element from an ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Remove the third element
        if (colors.size() >= 3) {
            colors.remove(2); // Index 2 is the third element
        }

        // Print out the collection
        System.out.println("Colors in the list after removal: " + colors);
    }
}
