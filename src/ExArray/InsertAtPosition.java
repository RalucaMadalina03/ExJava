package ExArray;

import java.util.LinkedList;

public class InsertAtPosition {
    //
    public static void main(String[] args) {

        //Insert Elements at the Specified Position in a Linked List

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Original LinkedList: " + linkedList);

        linkedList.add(1, "X");
        linkedList.add(2, "Y");

        System.out.println("LinkedList after inserting elements at specified positions: " + linkedList);
    }
}
