package generics;

import java.util.ArrayList;
import java.util.List;

public class Super {

    public static <T extends Number> void addNumberToList(List<? super T> list, T number) {
        list.add(number);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();

        addNumberToList(numberList, 42);
        addNumberToList(numberList, 3.14);

        System.out.println("Number List: " + numberList);

    }
}
