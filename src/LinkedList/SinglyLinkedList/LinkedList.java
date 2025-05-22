package LinkedList.SinglyLinkedList;

public class LinkedList {
    Node head;

    // function to create linked list of n numbers;
    public void createList(int n){
        Node last = head;
        for (int i = 1; i <= n; i++) {
            Node node = new Node(i);

            if(last != null){
                last.next = node;
                last = last.next;
            }
            else {
                head = node;
                last = head;
            }
        }
    }
    public void insertAtFirst(int val){
        head = new Node(val, head);
    }
    public void insertAtLast(int val){
        if(head == null){
            insertAtFirst(val);
            return;
        }
        Node node = head;
        while(node.next!= null){
            node = node.next;
        }
        node.next = new Node(val);
    }

    public void insertAtIndex(int position, int val){
        if(position < 0) return;

        Node dummy = new Node(0, head);
        Node node = dummy;

        for(int i = 0; i < position-1 && node != null; i++) {
            node = node.next;
        }
        if(node == null) return;

        node.next = new Node(val, node.next);
        head = dummy.next;
    }

    public void deleteFirst(){
        if(head == null) return;
        head = head.next;
    }

    public void deleteLast(){
        Node dummy = new Node(0, head);
        Node prev = dummy, curr = head;

        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        head = dummy.next;
    }

    public void middle(){
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow == null) return;
        System.out.println("Middle value: "+slow.val);
    }
    public void printList(){
        Node node = head;
        while(node  !=  null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.createList(3);
        list.insertAtFirst(100);
        list.insertAtLast(90);
        list.insertAtIndex(1,0);
        list.insertAtIndex(5,100);
//        list.insertAtIndex(4,100);
        list.deleteFirst();
        list.deleteLast();

        list.middle();

        list.printList();
    }
}
