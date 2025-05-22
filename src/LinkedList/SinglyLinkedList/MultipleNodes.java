package LinkedList.SinglyLinkedList;
//import LinkedList.Node;
public class MultipleNodes {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        // let's traverse the linkedlis
        Node node = node1;
        while (node != null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
