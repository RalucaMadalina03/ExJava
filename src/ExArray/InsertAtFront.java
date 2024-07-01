package ExArray;

import java.util.LinkedList;

public class InsertAtFront {
    public static void main(String[] args) {

        //Insert an Element at the Front of a Linked List

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Original LinkedList: " + linkedList);

        linkedList.addFirst("Z");

        System.out.println("LinkedList after inserting at front: " + linkedList);
    }
}
