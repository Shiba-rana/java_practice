import java.util.*;
class Car {
    Scanner sc = new Scanner(System.in);

    String model = sc.next();
    String color = sc.next();
    int price = sc.nextInt();

    void start() {
        System.out.println("Bhroom Bhroom ...");
    }

    void lock() {
        System.out.println("Car is Lock");
    }
    void unlock() {
        System.out.println("Car is Unlocked");
    }
}

/**
 * classObject
 */
public class classObject {
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("Car Model: " + c.model);
        System.out.println( "Color: " + c.color);
        System.out.println("Price: " + c.price);

    }
}