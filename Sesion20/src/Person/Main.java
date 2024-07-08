package Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Maria", 30),
                new Person("Alex", 25),
                new Person("Cristian", 35),
                new Person("David", 28)
        );


        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        sortedPersons.forEach(System.out::println);
    }
}
