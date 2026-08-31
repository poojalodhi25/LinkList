class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head ==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
    }

}
public class implementationSLL{
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(67);

        list.display();


    }}
