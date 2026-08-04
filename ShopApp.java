public class ShopApp {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.name = "SR";
        c1.size = "M";

        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "XL";
                break;
        }
        System.out.println(c1.size);
    }
}