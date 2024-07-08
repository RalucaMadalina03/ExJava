package Function;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        //Write a Function<Integer, String> that converts an Integer to its String representation using an anonymous class.

        Function<Integer, String> intToStringFunction = new Function<Integer, String>() {

            @Override
            public String apply(Integer i) {
                return i.toString();
            }
        };

        Integer testInteger = 123;
        String result = intToStringFunction.apply(testInteger);
        System.out.println("The string representation of " + testInteger + " is: " + result);
    }

}
