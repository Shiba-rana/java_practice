import java.util.*;

public class RevFirstKElmQueue {

    // Method to reverse first k elements of a queue
    public static void reverse(Queue<Integer> queue, int k) {
        Stack<Integer> st = new Stack<>();

        // Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(queue.remove());
        }

        // Pop from stack and add back to queue
        while (!st.isEmpty()) {
            queue.offer(st.pop());
        }

        // Move the remaining elements to the back
        int count = queue.size() - k;
        for (int i = 0; i < count; i++) {
            queue.offer(queue.remove());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }

        reverse(queue, k);

        System.out.println("Queue after reversing first " + k + " elements:");
        for (int val : queue) {
            System.out.print(val + " ");
        }
    }
}
