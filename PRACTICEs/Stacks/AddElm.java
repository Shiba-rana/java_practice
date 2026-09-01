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

        
        // peek()
        System.out.println(st.peek());
        
        // pop()
        System.out.println(st.pop());

        // size()
        System.out.println(st.size());

        // 
        System.out.println(st.capacity());

        //
        System.out.println(st.empty());

        // print
        System.out.println("Stack: " + st);
    }
}
