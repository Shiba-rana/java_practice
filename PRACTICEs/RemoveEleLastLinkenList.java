import java.util.*;

public class RemoveEleLastLinkenList {

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
    public static Node removeLast(Node head, int data) {
        if (head == null) {
            return null;
        }

        // If the list has only one node and it matches the data, return null
        if(head.next == null && head.data == data) {
            return null;
        }

        Node temp = head;

        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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

            head = removeLast(head, data);
        }

        // Print linked list
        printList(head);

    }
}