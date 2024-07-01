package ExArray;

import java.util.LinkedList;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

        // Get the First and Last Occurrence of the Specified Elements in a Linked List

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("E");

        System.out.println("Original LinkedList: " + linkedList);

        String element = "B";
        int firstOccurrence = linkedList.indexOf(element);
        int lastOccurrence = linkedList.lastIndexOf(element);

        System.out.println("First occurrence of '" + element + "': " + firstOccurrence);
        System.out.println("Last occurrence of '" + element + "': " + lastOccurrence);
    }
}
