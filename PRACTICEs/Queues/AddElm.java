import java.util.*;

public class AddElm {
    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();

        qu.offer(50);
        qu.offer(40);
        qu.offer(30);

        // peek
        System.out.println(qu.peek());

        // remove
        System.out.println(qu.remove());

        // size
        System.out.println(qu.size());

        System.out.println(qu.isEmpty());

        System.out.println(qu);

    }
}
