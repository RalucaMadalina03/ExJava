package Animal2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
                new Dog("Arya", 3),
                new Cat("Anubis", 2),
                new Dog("Max", null), // Dog with a null age
                new Cat("Kitty", 4)
        );


        animals.stream()
                .map(Animal::computeAge)
                .forEach(ageOpt -> ageOpt.ifPresentOrElse(
                        age -> System.out.println("Computed age: " + age),
                        () -> System.out.println("Age is not available.")
                ));
    }
}
