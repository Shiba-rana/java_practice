import java.util.ArrayList;

public class removeEvenNumArryList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(11);
        list.add(20);
        list.add(31);
        list.add(40);
        list.add(51);
        list.add(60);
        list.add(71);


        removeEven(list);
        System.out.println(list);
    }

    public static void removeEven(ArrayList<Integer> list){
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
