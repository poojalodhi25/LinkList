class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class listNodeClass {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayRecursive(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.val);
        displayRecursive(head.next);
    }

    public static void main(String[] args) {

        Node a = new Node(10);

        Node b = new Node(20);

        a.next = b;
    }
}