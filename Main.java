class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {

    // Function to find middle node
    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // Create linked list
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        // Connect nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // a is the head
        ListNode head = a;

        // Call function
        ListNode middle = middleNode(head);

        // Print middle node
        System.out.println("Middle node = " + middle.val);
    }
}