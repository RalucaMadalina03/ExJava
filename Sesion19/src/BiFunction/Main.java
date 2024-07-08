package BiFunction;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        // Write a BiFunction<Integer, Integer, Integer> that returns the sum of two integers using an anonymous class.

        BiFunction<Integer, Integer, Integer> sumFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        Integer num1 = 10;
        Integer num2 = 20;
        Integer result = sumFunction.apply(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result); // Output: The sum of 10 and 20 is: 30
    }

}
