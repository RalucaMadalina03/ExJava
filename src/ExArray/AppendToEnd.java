package ExArray;

import java.util.LinkedList;

public class AppendToEnd {
    public static void main(String[] args) {

        //Append an Element to the End of a Linked List

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Original LinkedList: " + linkedList);

        linkedList.add("D");

        System.out.println("LinkedList after appending an element: " + linkedList);
    }
}
