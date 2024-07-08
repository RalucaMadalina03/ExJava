package Animal2;

import java.util.Optional;

public class Dog extends Animal {

    public Dog(String name, Integer age) {
        super(name, age);
    }


    @Override
    public Optional<Integer> computeAge() {
        return age != null ? Optional.of(age * 7) : Optional.empty();
    }
}
