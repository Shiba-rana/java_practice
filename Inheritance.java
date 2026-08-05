
class Dog {
    void bark() {
        System.out.println("Dog Bark!");
    }
}

class Lion extends Dog {
    void roar() {
        System.out.println("Lion Roar!");
    }
}

class Animal extends Lion{

    void sound() {
        System.out.println("Animal Makes Sound");
    }
}
/**
 * Inheritance
 */
public class Inheritance {
    public static void main(String[] args) {
        
        Animal a = new Animal();

        a.bark();
        a.roar();
    }
    
}
