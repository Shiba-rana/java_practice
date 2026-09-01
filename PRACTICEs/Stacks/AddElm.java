package Stacks;
import java.util.*;

public class AddElm {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // add
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // print
        System.out.println("Stack: " + st);
    }
}
