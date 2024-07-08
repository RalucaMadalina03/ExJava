package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Double> randomDoubleSupplier = new Supplier<Double>() {
            private final Random random = new Random();

            @Override
            public Double get() {
                return random.nextDouble();
            }
        };

        Double randomValue = randomDoubleSupplier.get();
        System.out.println("Random double value: " + randomValue);
    }
}
