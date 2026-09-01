import java.util.*;

public class AddElm {
    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();

        qu.offer(50);
        qu.offer(40);
        qu.offer(30);

        System.out.println(qu);

    }
}
