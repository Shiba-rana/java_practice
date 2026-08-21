import java.util.*;

public class InsertEleFirstLinkenList {

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
    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        return newNode;
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

            head = insertAtBeginning(head, data);
        }

        // Print linked list
        printList(head);

    }
}