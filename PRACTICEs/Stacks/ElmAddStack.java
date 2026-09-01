import java.util.*;

public class ElmAddStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                    stack.pop();
                }
                stack.push(arr[i]);
            }
        }

        System.out.println("Final stack elements:");
        for (int val : stack) {
            System.out.print(val + " ");
        }
    }
}
