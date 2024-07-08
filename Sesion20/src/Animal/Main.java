package Animal;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
                new Dog("Arya"),
                new Cat("Anubis"),
                new Dog("Max"),
                new Cat("Luna")
        );


        animals.stream()
                .forEach(Animal::makeSound);
    }
}
