import java.util.ArrayList;

public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        // Add at index
        list.add(4, 50);
        list.add(5, 60);
        System.out.println(list);

        // Get
        System.out.println(list.get(2));

        // Set
        list.set(5, 70);
        System.out.println(list);

        // Remove
        list.remove(1);
        System.out.println(list);

        // Size
        System.out.println(list.size());

        // 
    }
}
