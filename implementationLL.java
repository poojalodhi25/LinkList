class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;
    Node tail;

    void interAtAnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
}

public class implementationLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.interAtAnd(10);
        list.interAtAnd(20);
        list.interAtAnd(30);
    }
}