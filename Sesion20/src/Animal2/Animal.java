package Animal2;

import java.util.Optional;

abstract class Animal {

    protected String name;
    protected Integer age;


    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public abstract Optional<Integer> computeAge();
}

