package Predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Write a Predicate<String> that checks if a string is non-empty using an anonymous class.

        Predicate<String> isNonEmptyString = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s != null && !s.isEmpty();
            }
        };

        String testString1 = "Hello, World!";
        String testString2 = "";
        String testString3 = null;

        System.out.println("Is 'Hello, World!' non-empty? " + isNonEmptyString.test(testString1));
        System.out.println("Is '' non-empty? " + isNonEmptyString.test(testString2));
        System.out.println("Is null non-empty? " + isNonEmptyString.test(testString3));
    }

}
