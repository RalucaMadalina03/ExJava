package MyInterface;

public class Main {
    public static void main(String[] args) {

        MyInterface anonymousInstance = new MyInterface() {
            @Override
            public void displayMessage() {
                System.out.println("Hello, from the anonymous class");
            }
        };


        anonymousInstance.displayMessage();


        MyInterface regularInstance = new MyInterface() {
            @Override
            public void displayMessage() {
                System.out.println("Hello, from MyInterface implementation");
            }
        };
        regularInstance.displayMessage();
    }
}
