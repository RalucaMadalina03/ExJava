package SumOfSquares;

import java.util.List;

public class SumOfSquares {


    public static int sumOfEvenSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = sumOfEvenSquares(numbers);

        System.out.println("The sum of the squares of all even numbers: " + result);
    }

}
