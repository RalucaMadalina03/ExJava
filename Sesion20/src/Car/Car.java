package Car;

public class Car {

    private String brand;
    private double price;


    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', price=" + price + '}';
    }
}
