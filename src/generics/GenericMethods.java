package generics;

public class GenericMethods {
    public static <T> T getFirstElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[0];
    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};
        Double[] dblArray = {1.1, 2.2, 3.3};

        Integer firstInt = getFirstElement(intArray);
        String firstStr = getFirstElement(strArray);
        Double firstDbl = getFirstElement(dblArray);

        System.out.println("First Integer: " + firstInt);
        System.out.println("First String: " + firstStr);
        System.out.println("First Double: " + firstDbl);
    }

}
