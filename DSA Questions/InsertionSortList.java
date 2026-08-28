class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            if (prev.val >= curr.val) {
                prev = dummy;
            }
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            curr = nextNode;
        }
        return dummy.next;
    }
}

public class InsertionSortList {
    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    // Helper method to build a linked list from an array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case: [4, 2, 1, 3]
        int[] input = {4, 2, 1, 3};
        ListNode head = buildList(input);

        System.out.print("Original List: ");
        printList(head);

        ListNode sortedHead = solution.insertionSortList(head);

        System.out.print("Sorted List:   ");
        printList(sortedHead);
    }
}
