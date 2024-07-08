package SuperClass;

public class Main {
    public static void main(String[] args) {
        SuperClass anonymousInstance = new SuperClass() {
            @Override
            public void displayMessage() {
                System.out.println("Hello, from the anonymous class");
            }
        };
        anonymousInstance.displayMessage();
        SuperClass regularInstance = new SuperClass();
        regularInstance.displayMessage();
        }
    }
