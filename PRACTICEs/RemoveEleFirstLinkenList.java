import java.util.*;

public class RemoveEleFirstLinkenList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert element at beginning
    public static Node removeFirst(Node head, int data) {
        if (head == null) {
            return null;
        }

        if (head.data == data) {
            return head.next;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // Print linked list
    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of elements
        int n = sc.nextInt();

        Node head = null;

        // Create linked list
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();

            head = removeFirst(head, data);
        }

        // Print linked list
        printList(head);

    }
}