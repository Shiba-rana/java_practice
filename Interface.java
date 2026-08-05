interface Payment {
    void pay();
}

class UpiPayment implements Payment{
    public void pay() {
        System.out.println("Upi Payment!");
    }
}

/**
 * Interface
 */
public class Interface {
    public static void main(String[] args) {
        UpiPayment p = new UpiPayment();

        p.pay();
    }
     
}

