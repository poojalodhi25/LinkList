class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class listNodeClass{
    public static void main(String [] args){
        Node a = new Node(10);
        Node b = new Node(20);
        a.next=b;
    }
}