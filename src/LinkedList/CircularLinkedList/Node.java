package LinkedList.CircularLinkedList;

public class Node {
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
