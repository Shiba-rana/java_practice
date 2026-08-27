import java.util.Scanner;

public class InsertEleLastLinkenList {
    // add element at last of linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert element at end
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

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

            head = insertAtEnd(head, data);
        }

        // Print linked list
        printList(head);

    }
}
