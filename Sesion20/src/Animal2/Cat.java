package Animal2;

import java.util.Optional;

public class Cat extends Animal {

    public Cat(String name, Integer age){
        super(name, age);
    }

    @Override
    public Optional<Integer> computeAge() {
        return age != null ? Optional.of(age * 5) : Optional.empty();
    }
}
