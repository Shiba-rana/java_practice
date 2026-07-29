class methodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static String add(String a, String b) {
        System.out.println("Hello");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add("Shiva", "Rana"));
    }
}
