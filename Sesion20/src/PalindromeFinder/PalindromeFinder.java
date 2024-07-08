package PalindromeFinder;

import java.util.List;

public class PalindromeFinder {

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static String findFirstPalindrome(List<String> strings) {
        return strings.stream()
                .filter(PalindromeFinder::isPalindrome)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "racecar", "banana", "madam", "car");

        String firstPalindrome = findFirstPalindrome(strings);
        if (firstPalindrome != null) {
            System.out.println("First palindrome: " + firstPalindrome);
        } else {
            System.out.println("No palindrome found in the list.");
        }
    }

}
