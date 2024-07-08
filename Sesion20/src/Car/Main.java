package Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


    public class Main {

        public static void main(String[] args) {

            List<Car> cars = Arrays.asList(
                    new Car("Toyota", 20000),
                    new Car("BMW", 55000),
                    new Car("Audi", 50000),
                    new Car("Ford", 25000)
            );


            Optional<Car> mostExpensiveCar = cars.stream()
                    .max(Comparator.comparingDouble(Car::getPrice));


            mostExpensiveCar.ifPresent(car -> System.out.println("The most expensive car is: " + car));
        }
    }
